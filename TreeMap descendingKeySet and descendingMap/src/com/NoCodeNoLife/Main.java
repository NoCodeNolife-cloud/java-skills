package com.NoCodeNoLife;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        Set<Integer> set = tree_map.descendingKeySet();
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Map<Integer, String> map = tree_map.descendingMap();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
