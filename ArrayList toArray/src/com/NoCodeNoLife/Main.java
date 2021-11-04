package com.NoCodeNoLife;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(6);

        Object[] target = arrayList.toArray();
        for (Object obj : target) {
            Integer integer = (Integer) obj;
            System.out.print(integer + " ");
        }
    }
}
