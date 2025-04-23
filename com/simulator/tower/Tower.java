package com.simulator.tower;

import com.simulator.aircraft.*;
import java.util.*;

public class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable p_flyables) {
        // add error handling here;
        observers.add(p_flyables);
        System.out.println("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") registered to weather tower.");
    }

    public void unregister(Flyable p_flyables) {
        List<Flyable> copy = new ArrayList<>(observers);
        for (Flyable f: copy) {
            if (((Aircraft)f).getID() == ((Aircraft) p_flyables).getID()) {
                observers.remove(f);
            }
        }
        System.out.println("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") unregistered from weather tower.");
    }

    protected void conditionChanged() {
        List<Flyable> copy = new ArrayList<>(observers);
        for (Flyable f: copy) {
            f.updateConditions();
        }
    }
}