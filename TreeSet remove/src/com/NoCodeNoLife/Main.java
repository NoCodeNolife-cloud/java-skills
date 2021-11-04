package com.NoCodeNoLife;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(4);
        treeSet.add(7);

        for (Iterator<Integer> iter = treeSet.iterator(); iter.hasNext(); ) {
            System.out.printf(iter.next() + " ");
        }
        System.out.println();

        treeSet.remove(5);
        for (Iterator<Integer> iter = treeSet.iterator(); iter.hasNext(); ) {
            System.out.printf(iter.next() + " ");
        }
    }
}
