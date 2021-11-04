package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(0);
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.add(4);
        linkedlist.add(3);
        linkedlist.add(2);
        linkedlist.add(1);
        linkedlist.add(0);

        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove first of 2:");
        linkedlist.removeFirstOccurrence(2);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove last of 4");
        linkedlist.removeLastOccurrence(4);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
