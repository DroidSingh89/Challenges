package com.example.user.symbiovolvochallenge.model.data;

import com.example.user.symbiovolvochallenge.model.bean.Weather;
import com.example.user.symbiovolvochallenge.model.data.remote.RemoteDataSource;

import java.util.List;

public class WeatherRepository {

    private static WeatherRepository instance = null;
    RemoteDataSource remoteDataSource;


    public static WeatherRepository getInstance() {
        if (instance == null) {
            instance = new WeatherRepository();
        }
        return instance;
    }

    private WeatherRepository() {
        remoteDataSource = new RemoteDataSource();
    }


    public void getWeather(List<String> location, final Callback callback) {


        remoteDataSource.getAllWeather(location, new Callback() {
            @Override
            public void onSuccess(List<Weather> weatherList) {
                callback.onSuccess(weatherList);
            }

            @Override
            public void onFailure(String error) {
                callback.onFailure(error);
            }
        });


    }


    public interface Callback {

        void onSuccess(List<Weather> weatherList);

        void onFailure(String error);
    }

}
