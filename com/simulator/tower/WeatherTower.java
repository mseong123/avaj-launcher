package com.simulator.tower;

import com.simulator.weather.WeatherProvider;
import com.simulator.Coordinates;
import java.io.FileWriter;
import java.io.IOException;

public class WeatherTower extends Tower {

    public WeatherTower(FileWriter p_Writer) {
        writer = p_Writer;
    }

    public String getWeather(Coordinates p_coordinates) {
        return WeatherProvider.getInstance().getCurrentWeather(p_coordinates);
    }

    public void changeWeather() throws IOException {
        this.conditionChanged();
    }
}