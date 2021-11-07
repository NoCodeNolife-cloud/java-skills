package com.NoCodeNoLife;

import java.util.Map;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {

        WeakHashMap<Integer, String> tree_map = new WeakHashMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        WeakHashMap<Integer, String> target = new WeakHashMap<>();
        target.putAll(tree_map);

        for (Map.Entry<Integer, String> entry : target.entrySet()) {
            System.out.println(entry);
        }
    }
}
