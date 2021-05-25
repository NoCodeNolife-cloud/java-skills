package com.nocodenolife;

import java.util.Vector;

public class Num<T extends Number> {

    private Vector<T> vector;

    public Num(Vector<T> vector) {
        this.vector = vector;
    }

    public double getAvg() {

        double sum = 0.0;
        for (T temp : vector) {

            sum +=  temp.doubleValue();
        }
        return sum / vector.size();
    }
}
