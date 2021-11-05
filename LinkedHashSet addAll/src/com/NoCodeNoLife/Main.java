package com.NoCodeNoLife;

import javax.swing.plaf.synth.SynthUI;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

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

        System.out.println("linkedHashSet:");
        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();

        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add(100);
        linkedHashSet1.add(101);

        System.out.println("linkedHashSet1:");
        for (Integer integer : linkedHashSet1) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("addAll:");
        linkedHashSet.addAll(linkedHashSet1);
        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
