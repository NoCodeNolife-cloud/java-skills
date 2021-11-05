package com.bin;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] argus) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(9);
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(7);
        linkedHashSet.add(6);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(0);

        LinkedList<Integer> linkedList_target = new LinkedList<>();
        linkedList_target.add(1);
        linkedList_target.add(5);
        linkedList_target.add(9);

        linkedHashSet.removeAll(linkedList_target);
        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
