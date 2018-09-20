package com.example.user.symbiovolvochallenge.view.weather;

import com.example.user.symbiovolvochallenge.model.bean.Weather;
import com.example.user.symbiovolvochallenge.view.base.BasePresenter;
import com.example.user.symbiovolvochallenge.view.base.BaseView;

import java.util.List;

public interface WeatherContract {

    interface View extends BaseView {

        void onWeatherList(List<Weather> weatherList);
    }


    interface Presenter extends BasePresenter<View> {

        void getAllWeather(List<String> locations);
    }
}

