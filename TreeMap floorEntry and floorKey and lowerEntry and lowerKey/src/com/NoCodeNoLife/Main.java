package com.NoCodeNoLife;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        System.out.println("floorEntry 30: " + tree_map.floorEntry(30));
        System.out.println("floorKey 30: " + tree_map.floorKey(30));
        System.out.println("lowerEntry 30: " + tree_map.lowerEntry(30));
        System.out.println("lowerKey 30: " + tree_map.lowerKey(30));
    }
}
