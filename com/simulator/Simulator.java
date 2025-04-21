
package com.simulator; 

import com.simulator.entities.WeatherProvider;
import com.simulator.entities.Coordinates;

public class Simulator {
    public static void main(String[] args) {
        
        WeatherProvider weatherprovider = WeatherProvider.getInstance();
        String weather = weatherprovider.getCurrentWeather();
        System.out.println(weather);
    }
}