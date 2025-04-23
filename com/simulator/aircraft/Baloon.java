package com.simulator.aircraft;

import com.simulator.Coordinates;
import java.io.FileWriter;
import java.io.IOException;

public class Baloon extends Aircraft {
    String newline = System.lineSeparator();

    public Baloon(long p_id, String p_name, String p_type, Coordinates p_coordinates, FileWriter p_writer) {
        super(p_id, p_name, p_type, p_coordinates, p_writer);
    }

    public void updateConditions() throws IOException {
        //error here, need to register tower first
        String weather = this.weatherTower.getWeather(this.coordinates);
        if (weather == "SUN") {
            this.coordinates.setLongitude(2);
            this.coordinates.setHeight(4);
            writer.append(this.type + "#" + this.name + "(" + this.id + "): SUN!" + newline);
        }
        else if (weather == "RAIN") {
            this.coordinates.setHeight(-5);
            writer.append(this.type + "#" + this.name + "(" + this.id + "): RAIN!" + newline);
        }
        else if (weather == "FOG") {
            this.coordinates.setHeight(-3);
            writer.append(this.type + "#" + this.name + "(" + this.id + "): FOG!" + newline);
        }
        else if (weather == "SNOW") {
            this.coordinates.setHeight(-15);
            writer.append(this.type + "#" + this.name + "(" + this.id + ") SNOW!" + newline);
        }
        if (this.coordinates.getHeight() == 0) {
            writer.append(this.type + "#" + this.name + "(" + this.id + ") landing." + newline);
            this.weatherTower.unregister(this);
        }
    }


}