package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        Generic<Integer, Double> generic = new Generic<>(10, 15.0);
        System.out.println(generic.toString());
    }
}
