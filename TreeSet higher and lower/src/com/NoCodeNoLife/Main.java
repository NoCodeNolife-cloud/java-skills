package com.NoCodeNoLife;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(4);
        treeSet.add(7);

        System.out.println("lower than 3 is " + treeSet.lower(3));
        System.out.println("lower than 5 is " + treeSet.lower(5));

        System.out.println("higher than 16 is " + treeSet.higher(16));
        System.out.println("higher than 15 is " + treeSet.higher(15));
    }
}
