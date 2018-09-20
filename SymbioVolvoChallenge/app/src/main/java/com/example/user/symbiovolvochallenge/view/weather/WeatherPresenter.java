package com.example.user.symbiovolvochallenge.view.weather;

import com.example.user.symbiovolvochallenge.model.bean.Weather;
import com.example.user.symbiovolvochallenge.model.data.WeatherRepository;

import java.util.List;

public class WeatherPresenter implements WeatherContract.Presenter{

    WeatherContract.View view;
    WeatherRepository weatherRepository;

    public WeatherPresenter() {
        this.weatherRepository = WeatherRepository.getInstance();

    }

    @Override
    public void getAllWeather(List<String> locations) {

        weatherRepository.getWeather(locations, new WeatherRepository.Callback() {
            @Override
            public void onSuccess(List<Weather> weatherList) {
                view.onWeatherList(weatherList);
            }

            @Override
            public void onFailure(String error) {
                view.showError(error);

            }
        });
    }

    @Override
    public void attachView(WeatherContract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
