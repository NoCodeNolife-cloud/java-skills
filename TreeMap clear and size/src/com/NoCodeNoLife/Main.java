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

        System.out.println("tree_map.size: " + tree_map.size());

        tree_map.clear();

        System.out.println("tree_map.size: " + tree_map.size());
    }
}
