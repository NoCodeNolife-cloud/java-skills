package com.NoCodeNoLife;

import java.util.IdentityHashMap;

public class Main {

    public static void main(String[] args) {

        // Create a hash map
        IdentityHashMap<String, Double> ihm = new IdentityHashMap<>();

        // Put elements to the map
        ihm.put("Maxsu", 10000.30);
        ihm.put("李一帅", 9123.20);
        ihm.put("陈宏", 13000.40);
        ihm.put("张大为", 1099.82);
        ihm.put("韩国侠", -1999.08);

        for (Double value : ihm.values()) {
            System.out.println(value);
        }
    }
}
