package com.simulator.aircraft;

import com.simulator.Coordinates;
import java.io.FileWriter;
import java.io.IOException;

public class Aircraft extends Flyable {
    protected long id;
    protected String name;
    protected String type;
    protected Coordinates coordinates;
    protected FileWriter writer;

    protected Aircraft (long p_id, String p_name, String p_type, Coordinates p_coordinates, FileWriter p_writer) {
        this.id = p_id;
        this.name = p_name;
        this.type = p_type;
        this.coordinates = p_coordinates;
        writer = p_writer;
    }

    public void updateConditions() throws IOException{
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