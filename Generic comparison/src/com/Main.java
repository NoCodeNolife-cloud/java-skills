package com;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0, 100));
        }
        sort(linkedList);
        System.out.println(linkedList);
    }

    public static <T extends Comparable> void sort(LinkedList<T> linkedList) {
        linkedList.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }
}