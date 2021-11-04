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

        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove:");
        linkedlist.remove();
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove index of 1:");
        linkedlist.remove(1);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove index of 2");
        Object target = linkedlist.get(2);
        linkedlist.remove(target);
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("removeFirst:");
        linkedlist.removeFirst();
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("removeLast:");
        linkedlist.removeLast();
        for (Integer integer : linkedlist) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
