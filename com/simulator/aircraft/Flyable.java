package com.simulator.aircraft;

import com.simulator.tower.WeatherTower;

public abstract class Flyable {
    protected WeatherTower weatherTower;

    public void registerTower(WeatherTower p_tower) {
        weatherTower = p_tower;
    }

    public abstract void updateConditions();
}