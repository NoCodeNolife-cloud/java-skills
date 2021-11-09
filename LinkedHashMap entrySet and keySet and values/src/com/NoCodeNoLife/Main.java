package com.NoCodeNoLife;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> tree_map = new LinkedHashMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        System.out.println("entrySet:");
        for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("keySet:");
        for (Integer integer : tree_map.keySet()) {
            System.out.println(integer);
        }

        System.out.println("values:");
        for (String value : tree_map.values()) {
            System.out.println(value);
        }
    }
}
