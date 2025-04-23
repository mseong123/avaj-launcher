package com.simulator.aircraft;

import com.simulator.Coordinates;

public class Aircraft extends Flyable {
    protected long id;
    protected String name;
    protected String type;
    protected Coordinates coordinates;

    protected Aircraft (long p_id, String p_name, String p_type, Coordinates p_coordinates) {
        this.id = p_id;
        this.name = p_name;
        this.type = p_type;
        this.coordinates = p_coordinates;
    }

    public void updateConditions() {
    }

    public long getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getType() {
        return this.type;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }
}