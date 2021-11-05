package com.NoCodeNoLife;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(9);
        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(6);
        linkedHashSet.add(0);

        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("is empty? " + linkedHashSet.isEmpty());
        linkedHashSet.clear();
        System.out.println("is empty?" + linkedHashSet.isEmpty());
    }
}
