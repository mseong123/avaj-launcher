package com.simulator.tower;

import com.simulator.aircraft.*;
import java.util.List;
import java.util.ArrayList;

public class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable p_flyables) {
        // add error handling here;
        observers.add(p_flyables);
        System.out.println("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") registered to weather tower.");
    }

    public void unregister(Flyable p_flyables) {
        observers.removeIf(element -> ((Aircraft)element).getID() == ((Aircraft)p_flyables).getID());
        System.out.println("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") unregistered to from weather tower.");
    }

    protected void conditionChanged() {
        observers.forEach(element -> element.updateConditions());
    }
}