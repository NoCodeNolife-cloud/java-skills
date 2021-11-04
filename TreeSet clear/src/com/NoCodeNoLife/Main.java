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

        System.out.println("before clear, the size is " + treeSet.size());

        treeSet.clear();

        System.out.println("now, thw size is " + treeSet.size());
    }
}
