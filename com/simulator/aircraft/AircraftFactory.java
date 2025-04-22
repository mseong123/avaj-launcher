package com.simulator.aircraft;

import com.simulator.Coordinates;

// singleton and factory class

public class AircraftFactory {
    private static final AircraftFactory instance = new AircraftFactory();
    private static int id = 1;

    private AircraftFactory() {
    } 

    public static AircraftFactory getInstance() {
        return instance;
    }

    public Flyable newAirCraft(String p_type, String p_name, Coordinates p_coordinates) {
        if (p_type.equals("Baloon"))
            return new Baloon(id++, p_name, p_type, p_coordinates);
        else if (p_type.equals("JetPlane"))
            return new JetPlane(id++, p_name, p_type, p_coordinates);
        else if (p_type.equals("Helicopter")) 
            return new Helicopter(id++, p_name, p_type, p_coordinates);
        else 
            throw new IllegalArgumentException(("Invalid aircraft type: " + p_type));
        
    }
}