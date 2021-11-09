package com.NoCodeNoLife;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> tree_map = new LinkedHashMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        System.out.println("size: " + tree_map.size());
        System.out.println("isEmpty: " + tree_map.isEmpty());


        System.out.println("---clear---");
        tree_map.clear();

        System.out.println("size: " + tree_map.size());
        System.out.println("isEmpty: " + tree_map.isEmpty());
    }
}
