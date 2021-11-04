package com.NoCodeNoLife;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(4);
        treeSet.add(7);

        SortedSet<Integer> sortedSet = treeSet.tailSet(10);
        for (Iterator<Integer> iter = sortedSet.iterator(); iter.hasNext(); ) {
            System.out.printf(iter.next() + " ");
        }
        System.out.println();
    }
}
