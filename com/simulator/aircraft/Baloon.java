package com.simulator.aircraft;

import com.simulator.Coordinates;

public class Baloon extends Aircraft {
    public Baloon(long p_id, String p_name, String p_type, Coordinates p_coordinates) {
        super(p_id, p_name, p_type, p_coordinates);
    }

    public void updateConditions() {
        //error here, need to register tower first
        String weather = this.tower.getWeather(this.coordinates);
        if (weather == "SUN") {
            this.coordinates.setLongitude(2);
            this.coordinates.setHeight(4);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): SUN!");
        }
        else if (weather == "RAIN") {
            this.coordinates.setHeight(-5);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): RAIN!");
        }
        else if (weather == "FOG") {
            this.coordinates.setHeight(-3);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): FOG!");
        }
        else if (weather == "SNOW") {
            this.coordinates.setHeight(-15);
            System.out.println(this.type + "#" + this.name + "(" + this.id + ") SNOW!");
        }
        if (this.coordinates.getHeight() == 0) {
            System.out.println(this.type + "#" + this.name + "(" + this.id + ") landing.");
            this.tower.unregister(this);
        }
    }


}