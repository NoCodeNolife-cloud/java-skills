package com.NoCodeNoLife;

import java.util.IdentityHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        IdentityHashMap<Integer, Double> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(1, 11.0);
        identityHashMap.put(2, 12.0);
        identityHashMap.put(3, 13.0);

        IdentityHashMap<Integer, Double> identityHashMap1 = new IdentityHashMap<>();
        identityHashMap1.put(4, 14.0);
        identityHashMap1.put(5, 15.0);
        identityHashMap1.put(6, 16.0);

        identityHashMap.putAll(identityHashMap1);
        for (Map.Entry<Integer, Double> entry : identityHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
