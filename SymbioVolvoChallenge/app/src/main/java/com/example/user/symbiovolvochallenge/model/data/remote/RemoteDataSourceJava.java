package com.example.user.symbiovolvochallenge.model.data.remote;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.user.symbiovolvochallenge.model.bean.Location;
import com.example.user.symbiovolvochallenge.model.bean.Weather;
import com.example.user.symbiovolvochallenge.model.bean.consolidatedweather.ConsolidatedWeather;
import com.example.user.symbiovolvochallenge.model.data.WeatherRepository;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class RemoteDataSourceJava {

    private static final String BASE_URL = "https://www.metaweather.com/";

    private Retrofit createRetrofit() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    }

    private RemoteService getRemoteService() {
        return createRetrofit().create(RemoteService.class);
    }


    private Observable<ConsolidatedWeather> getLocationWeather(String location) {
        return getRemoteService()
                .getLocationId(location)
                .flatMap(new Function<List<Location>, Observable<ConsolidatedWeather>>() {
                    @Override
                    public Observable<ConsolidatedWeather> apply(List<Location> location) {
                        return getRemoteService().getForecast(String.valueOf(location.get(0).getWoeid()));
                    }
                });
    }

    public void getAllWeather(List<String> locations, final WeatherRepository.Callback callback) {

        Observable
                .zipIterable(getObservableList(locations),
                        getZipper(), false, 1000)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Weather>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Weather> weathers) {

                        callback.onSuccess(weathers);
                    }

                    @Override
                    public void onError(Throwable e) {

                        callback.onFailure(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @NonNull
    private Function<Object[], List<Weather>> getZipper() {
        return new Function<Object[], List<Weather>>() {
            @Override
            public List<Weather> apply(Object[] objects) throws Exception {
                List<Weather> consolidatedWeathers = new ArrayList<>();

                for (Object object : objects) {
                    ConsolidatedWeather consolidatedWeather = (ConsolidatedWeather) object;
                    Weather weather = new Weather(consolidatedWeather.getTitle(), consolidatedWeather.getConsolidatedWeather().get(1));
                    consolidatedWeathers.add(weather);
                }
                return consolidatedWeathers;
            }
        };
    }

    private List<Observable<ConsolidatedWeather>> getObservableList(List<String> location) {
        List<Observable<ConsolidatedWeather>> consolidateListObs = new ArrayList<>();

        for (String s : location) {
            consolidateListObs.add(getLocationWeather(s));
        }
        return consolidateListObs;
    }


    interface RemoteService {

        //        get location address
        @GET("api/location/search/")
        Observable<List<Location>> getLocationId(@Query("query") String location);

        @GET("/api/location/{woeid}/")
        Observable<ConsolidatedWeather> getForecast(@Path("woeid") String id);

    }


}
