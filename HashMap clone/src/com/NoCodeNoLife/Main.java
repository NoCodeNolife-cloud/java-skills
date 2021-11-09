package com.NoCodeNoLife;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> tree_map = new HashMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("------");

        HashMap<Integer, String> target = (HashMap) tree_map.clone();
        for (Map.Entry<Integer, String> entry : target.entrySet()) {
            System.out.println(entry);
        }
    }
}
