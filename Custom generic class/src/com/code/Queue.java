package com.code;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> items;

    public Queue() {

        this.items = new ArrayList<T>();
    }

    public void queue(T item) {

        this.items.add(item);
    }

    public T dequeue() {

        if (items.isEmpty()) {

            return null;
        } else {

            return this.items.remove(0);
        }
    }

    public String toString() {

        return items.toString();
    }
}
