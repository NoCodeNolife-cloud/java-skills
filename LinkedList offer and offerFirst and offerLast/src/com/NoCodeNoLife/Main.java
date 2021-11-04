package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
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

        linkedlist.offer(10);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        linkedlist.offerFirst(11);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        linkedlist.offerLast(12);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
