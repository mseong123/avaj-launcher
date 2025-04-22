package com.simulator.tower;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates p_coordinates) {
        return WeatherProvider.getInstance().getWeather(p_coordinates);
    }
    public void changeWeather() {
        this.conditionChanged();
    }
}