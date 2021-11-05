package com.NOCODENOLIFE;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] argue) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(9);
        linkedHashSet.add(7);
        linkedHashSet.add(3);
        linkedHashSet.add(8);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(6);
        linkedHashSet.add(0);

        LinkedHashSet<Integer> target = new LinkedHashSet<>();
        target.add(1);
        target.add(5);
        target.add(9);

        linkedHashSet.removeAll(target);
        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
    }
}
