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

        System.out.println("and 100 at index of 5:");
        arrayList.add(5, 100);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove index of 5:");
        arrayList.remove(5);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("remove 5:");
        Integer target = 5;
        arrayList.remove(target);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
