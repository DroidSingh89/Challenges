package com.example.user.symbiovolvochallenge.model.bean;

import com.example.user.symbiovolvochallenge.model.bean.consolidatedweather.ConsolidatedWeatherItem;

public class Weather {

    public String location;
    public ConsolidatedWeatherItem consolidatedWeatherItem;

    public Weather(String location, ConsolidatedWeatherItem consolidatedWeatherItem) {
        this.location = location;
        this.consolidatedWeatherItem = consolidatedWeatherItem;
    }

    public String getLocation() {
        return location;
    }

    public ConsolidatedWeatherItem getConsolidatedWeatherItem() {
        return consolidatedWeatherItem;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "location='" + location + '\'' +
                ", consolidatedWeatherItem=" + consolidatedWeatherItem +
                '}';
    }
}
