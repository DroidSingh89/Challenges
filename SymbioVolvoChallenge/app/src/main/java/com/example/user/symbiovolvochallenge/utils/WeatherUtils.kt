package com.example.user.symbiovolvochallenge.utils

import com.example.user.symbiovolvochallenge.model.bean.Weather

object WeatherUtils {

    fun formatIcon(weather: Weather): String {

        val iconAbbr = weather.getConsolidatedWeatherItem().weatherStateAbbr
        return "https://www.metaweather.com/static/img/weather/png/64/$iconAbbr.png"

    }
}
