package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(9);
        linkedlist.add(5);
        linkedlist.add(7);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(6);
        linkedlist.add(0);

        Object[] res = linkedlist.toArray();

        for (Object object : res) {
            Integer integer = (Integer) object;
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
