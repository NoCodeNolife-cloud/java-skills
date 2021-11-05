package com.NoCodeNoLife;

import java.util.IdentityHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        // Instantiates a IdentityHashMap object
        Map<Integer, String> map = new IdentityHashMap<Integer, String>();

        // By using put() method is to add
        // key-value pairs in a IdentityHashMap
        map.put(10, "C");
        map.put(20, "C++");
        map.put(50, "JAVA");
        map.put(40, "PHP");
        map.put(30, "SFDC");

        // Display IdentityHashMap
        System.out.println("IdentityHashMap: " + map);

        // By using containsValue() method is
        // to check whether this map associates
        // any key for the given key elemen or nott
        // of this IdentityHashMap

        boolean status = map.containsValue("PHP");

        System.out.print("map.containsValue(PHP): ");
        System.out.println(status);
    }
}
