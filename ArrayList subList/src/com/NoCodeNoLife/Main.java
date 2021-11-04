package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.List;

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

        List<Integer> res = arrayList.subList(3, 7);
        for (Integer integer : res) {
            System.out.print(integer + " ");
        }
    }
}
