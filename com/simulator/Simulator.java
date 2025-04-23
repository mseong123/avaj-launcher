
package com.simulator; 

// import com.simulator.weather.WeatherProvider;
import java.io.*;
import java.io.IOException;

import com.simulator.aircraft.*;
import com.simulator.tower.WeatherTower;

public class Simulator {
    public static void main(String[] args) {
        int simulationCount = 0;
        AircraftFactory factory = AircraftFactory.getInstance();
        String newline = System.lineSeparator();
        
        //error checking of args
        if (args.length != 1) {
            throw new IllegalArgumentException(); 
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("scenario.txt"));
            FileWriter writer = new FileWriter("simulation.txt", true)) {
            String line;
            WeatherTower tower = new WeatherTower(writer);
            int lineCount = 0;
            //parse file and instantialize classes
            while((line = reader.readLine()) != null) {
                if (lineCount++ == 0) 
                    simulationCount = Integer.parseInt(line);
                else {
                    String[] splitLine = line.split("[\\s]");
                    Flyable aircraft = factory.newAirCraft(
                        splitLine[0], 
                        splitLine[1], 
                        new Coordinates(Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[3]), Integer.parseInt(splitLine[4])),
                        writer
                        );
                    aircraft.registerTower(tower);
                    tower.register(aircraft);
                }
            }
            //run simulation
            for (int i = 0; i < simulationCount; i++) {
                //single entry point
                writer.append(newline + "Simulation " + (i + 1) + newline + newline);
                tower.changeWeather();
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Some other error occured: " + e.getMessage());
            System.exit(1);
        }
        
    }
}