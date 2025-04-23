package com.simulator.tower;

import com.simulator.aircraft.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Tower {
    private List<Flyable> observers = new ArrayList<>();
    protected FileWriter writer;
    String newline = System.lineSeparator();

    public void register(Flyable p_flyables) throws IOException {
        // add error handling here;
        observers.add(p_flyables);
        writer.append("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") registered to weather tower." + newline);
    }

    public void unregister(Flyable p_flyables) throws IOException{
        List<Flyable> copy = new ArrayList<>(observers);
        for (Flyable f: copy) {
            if (((Aircraft)f).getID() == ((Aircraft) p_flyables).getID()) {
                observers.remove(f);
            }
        }
        writer.append("Tower says: " + ((Aircraft)p_flyables).getType() + "#" + ((Aircraft)p_flyables).getName()
        + "(" + ((Aircraft)p_flyables).getID() + ") unregistered from weather tower." + newline);
    }

    protected void conditionChanged() throws IOException {
        List<Flyable> copy = new ArrayList<>(observers);
        for (Flyable f: copy) {
            f.updateConditions();
        }
    }
}