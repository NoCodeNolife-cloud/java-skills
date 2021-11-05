package com.NoCodeNoLife;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] argus) {

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

        HashSet<Integer> copy = (HashSet) hashSet.clone();

        for (Integer integer : copy) {
            System.out.print(integer + " ");
        }

        System.out.println();
    }
}
