
package com.simulator; 

// import com.simulator.weather.WeatherProvider;
import java.io.*;
import java.io.IOException;

public class Simulator {
    public static void main(String[] args) {
        // Coordinates coordinates = new Coordinates(600,5,299); 
        // WeatherProvider weatherprovider = WeatherProvider.getInstance();
        // String weather = weatherprovider.getCurrentWeather(coordinates);
        // System.out.println(weather);
        int simulationCount;
        try(BufferedReader reader = new BufferedReader(new FileReader("scenario.txt"))) {
            String line;
            int lineCount = 0;
            while((line = reader.readLine()) != null) {
                if (lineCount++ == 0) 
                    simulationCount = Integer.parseInt(line);
                else {
                   String[] arr = line.split("[\\s]");
                   for (String s : arr)
                        System.out.println(s);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        

    }
}