package com.simulator.tower;

import com.simulator.aircraft.Flyable;
import com.utils.List;

public class Tower {
    private List<Flyable> observers;

    public void register(Flyable p_flyables) {
        // add error handling here;
        observers.add(p_flyables);
        System.out.println("Tower says: " + p_flyables.getType() + p_flyables.getName()
        + "(" + p_flyables.getID() + ") registered to weather tower.")
    }

    public void unregister(Flyable p_flyables) {
        observers.removeIf(element -> element.getID() == p_flyables.getID());
        System.out.println("Tower says: " + p_flyables.getType() + p_flyables.getName()
        + "(" + p_flyables.getID() + ") unregistered to from weather tower.")
    }

    protected void conditionChanged() {
        observers.forEach(element -> element.updateConditions());
    }
}