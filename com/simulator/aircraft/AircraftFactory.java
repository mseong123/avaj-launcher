package com.simulator.aircraft;

import com.simulator.Coordinates;
import java.io.FileWriter;

// singleton and factory class

public class AircraftFactory {
    private static final AircraftFactory instance = new AircraftFactory();
    private static int id = 1;

    private AircraftFactory() {
    } 

    public static AircraftFactory getInstance() {
        return instance;
    }

    public Flyable newAirCraft(String p_type, String p_name, Coordinates p_coordinates, FileWriter p_writer) {
        if (p_type.equals("Baloon"))
            return new Baloon(id++, p_name, p_type, p_coordinates, p_writer);
        else if (p_type.equals("JetPlane"))
            return new JetPlane(id++, p_name, p_type, p_coordinates, p_writer);
        else
            return new Helicopter(id++, p_name, p_type, p_coordinates, p_writer); 
    }
}