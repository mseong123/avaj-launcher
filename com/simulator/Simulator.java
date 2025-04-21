
package com.simulator; 

import com.simulator.WeatherProvider;
import com.simulator.Coordinates;

public class Simulator {
    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates(600,5,299); 
        WeatherProvider weatherprovider = WeatherProvider.getInstance();
        String weather = weatherprovider.getCurrentWeather(coordinates);
        System.out.println(weather);
    }
}