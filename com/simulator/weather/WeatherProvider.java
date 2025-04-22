package com.simulator.weather;

import com.simulator.Coordinates;

//singleton class
public class WeatherProvider {
    // have to use static in attribute below because when instantializing, no access to instance. Have to 
    // put instance somewhere. 
    private static final WeatherProvider instance = new WeatherProvider();
    private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {

    }
    public static WeatherProvider getInstance() {
        return instance;
    }
    private int calculateScore(Coordinates p_coordinates) {
        return ((p_coordinates.getLongtitude() * 3) 
        + (p_coordinates.getLatitude() * 5)
        + (p_coordinates.getHeight() * 7)) % 100;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        int score = this.calculateScore(p_coordinates);
        if (score >= 0 && score < 25) 
            return weather[0];
        else if (score >=25 && score < 50)
            return weather[1];
        else if (score >=50 && score < 75)
            return weather[2];
        else
            return weather[3];
    }
}