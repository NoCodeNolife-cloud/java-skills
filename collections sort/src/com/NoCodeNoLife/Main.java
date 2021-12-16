package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            arrayList.add((int) (random.nextInt(0, 50)));
        }
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }
                if (o1 < o2) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return -1;
                }
                if (o1 > o2) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(arrayList);
    }
}
