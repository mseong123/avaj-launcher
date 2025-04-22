package com.simulator.tower;

import com.simulator.weather.WeatherProvider;
import com.simulator.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates p_coordinates) {
        return WeatherProvider.getInstance().getCurrentWeather(p_coordinates);
    }
    public void changeWeather() {
        this.conditionChanged();
    }
}