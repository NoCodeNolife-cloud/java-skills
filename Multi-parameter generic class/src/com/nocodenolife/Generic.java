package com.nocodenolife;

public class Generic<T, R> {

    private T t;
    private R r;

    public Generic(T t, R r) {
        this.t = t;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "t=" + t +
                ", r=" + r +
                '}';
    }
}
