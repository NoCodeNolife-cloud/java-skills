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

        List<Integer> linkedlisttarget = new LinkedList<>();
        linkedlisttarget.add(10);
        linkedlisttarget.add(11);
        linkedlisttarget.addAll(linkedlist);

        for (Integer integer : linkedlisttarget) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
