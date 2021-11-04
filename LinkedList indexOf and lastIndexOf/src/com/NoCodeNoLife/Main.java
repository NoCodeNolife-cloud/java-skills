package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("indexOf 3 is: " + linkedList.indexOf(3));
        System.out.println("last index of 3 is: " + linkedList.lastIndexOf(3));
    }
}
