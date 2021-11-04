package com.NoCodeNoLife;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("the first index of 2 is " + arrayList.indexOf(2));
        System.out.println("the last index of 2 is " + arrayList.lastIndexOf(2));
    }
}
