package com.NoCodeNoLife;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(0);

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("is arrayList has 5? " + arrayList.contains(5));
        System.out.println("is arrayList has -1? " + arrayList.contains(-1));
    }
}
