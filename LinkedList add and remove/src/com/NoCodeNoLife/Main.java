package com.NoCodeNoLife;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(9);
        linkedlist.add(5);
        linkedlist.add(1);
        linkedlist.add(8);
        linkedlist.add(2);
        linkedlist.add(7);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(6);
        linkedlist.add(0);

        System.out.println("origin:");
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        linkedlist.add(5, 5000);
        System.out.println("add 5000 in index of 5:");
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        linkedlist.remove(1);
        System.out.println("remove index of 1:");
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Integer target = linkedlist.get(5);
        linkedlist.remove(target);
        System.out.println("remove index of 5:");
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
