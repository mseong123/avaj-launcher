package com.simulator.aircraft;

import com.simulator.Coordinates;

public class JetPlane extends Aircraft {
    public JetPlane(long p_id, String p_name, String p_type, Coordinates p_coordinates) {
        super(p_id, p_name, p_type, p_coordinates);
    }
    public void updateConditions() {
        //error here, need to register tower first
        String weather = this.weatherTower.getWeather(this.coordinates);
        if (weather == "SUN") {
            this.coordinates.setLatitude(10);
            this.coordinates.setHeight(2);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): SUN!");
        }
        else if (weather == "RAIN") {
            this.coordinates.setLatitude(5);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): RAIN!");
        }
        else if (weather == "FOG") {
            this.coordinates.setLatitude(1);
            System.out.println(this.type + "#" + this.name + "(" + this.id + "): FOG!");
        }
        else if (weather == "SNOW") {
            this.coordinates.setHeight(-7);
            System.out.println(this.type + "#" + this.name + "(" + this.id + ") SNOW!");
        }
        if (this.coordinates.getHeight() == 0) {
            System.out.println(this.type + "#" + this.name + "(" + this.id + ") landing.");
            this.weatherTower.unregister(this);
        }
    }

}