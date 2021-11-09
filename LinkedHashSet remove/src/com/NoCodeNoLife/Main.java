package com.NoCodeNoLife;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
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

        System.out.println("remove 5:");
        hashSet.remove(5);

        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
