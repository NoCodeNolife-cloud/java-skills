package com.NoCodeNoLife;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(9);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(6);
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(0);

        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("clear");
        hashSet.clear();
        System.out.println("is the hashSet empty? " + hashSet.isEmpty());
    }
}
