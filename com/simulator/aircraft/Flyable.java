package com.simulator.aircraft;

import com.simulator.tower.WeatherTower;

abstract class Flyable {
    protected WeatherTower tower;

    public registerTower(WeatherTower p_tower) {
        tower = p_tower;
    }

    abstract void updateConditions();
}