package com.example.user.symbiovolvochallenge.model.data.remote

import android.util.Log

import com.example.user.symbiovolvochallenge.model.bean.Location
import com.example.user.symbiovolvochallenge.model.bean.Weather
import com.example.user.symbiovolvochallenge.model.bean.consolidatedweather.ConsolidatedWeather


import java.util.ArrayList

import android.content.ContentValues.TAG
import com.example.user.symbiovolvochallenge.model.data.WeatherRepository
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Function

import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

class RemoteDataSource {

    private val remoteService: RemoteService
        get() = createRetrofit().create(RemoteService::class.java)

    private val zipper: Function<Array<Any>, List<Weather>>
        get() = Function { objects ->
            val consolidatedWeathers = ArrayList<Weather>()

            for (`object` in objects) {
                val consolidatedWeather = `object` as ConsolidatedWeather
                val weather = Weather(consolidatedWeather.title, consolidatedWeather.consolidatedWeather[1])
                consolidatedWeathers.add(weather)
            }
            consolidatedWeathers
        }

    private fun createRetrofit(): Retrofit {

        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

    }


    private fun getLocationWeather(location: String): Observable<ConsolidatedWeather> {
        return remoteService
                .getLocationId(location)
                .flatMap { location -> getWeather(location[0].woeid.toString()) }
    }

    private fun getWeather(id: String): Observable<ConsolidatedWeather> {
        return remoteService.getForecast(id)
    }

    fun getAllWeather(locations: List<String>, callback: WeatherRepository.Callback) {

        Observable
                .zipIterable(getObservableList(locations),
                        zipper, false, 1000)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<List<Weather>> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onNext(weathers: List<Weather>) {

                        callback.onSuccess(weathers)
                    }

                    override fun onError(e: Throwable) {

                        callback.onFailure(e.toString())
                    }

                    override fun onComplete() {

                    }
                })
    }

    private fun getObservableList(location: List<String>): List<Observable<ConsolidatedWeather>> {
        val consolidateListObs = ArrayList<Observable<ConsolidatedWeather>>()

        for (s in location) {
            consolidateListObs.add(getLocationWeather(s))
        }
        return consolidateListObs
    }

    internal interface RemoteService {

        //        get location address
        @GET("api/location/search/")
        fun getLocationId(@Query("query") location: String): Observable<List<Location>>

        @GET("/api/location/{woeid}/")
        fun getForecast(@Path("woeid") id: String): Observable<ConsolidatedWeather>

    }

    companion object {

        private val BASE_URL = "https://www.metaweather.com/"
    }


}
