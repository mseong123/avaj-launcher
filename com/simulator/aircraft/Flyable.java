package com.simulator.aircraft;

import com.simulator.tower.WeatherTower;

public abstract class Flyable {
    protected WeatherTower tower;

    public void registerTower(WeatherTower p_tower) {
        tower = p_tower;
    }

    public abstract void updateConditions();
}