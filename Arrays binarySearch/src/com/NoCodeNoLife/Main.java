package com.NoCodeNoLife;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = {1, 9, 5, 7, 3, 2, 8, 4, 6};
        List<Integer> list = new ArrayList<Integer>();
        for (Integer item : integers) {
            list.add(item);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Object[] res = list.toArray();
        // print
        for (Object item : res) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        // binary search
        System.out.println(Arrays.binarySearch(res, 6));
        System.out.println(Arrays.binarySearch(res, -10));
        // find key 6 between index 1 to 3
        System.out.println(Arrays.binarySearch(res, 1, 3, 6));
        System.out.println(Arrays.binarySearch(res, 1, 6, 6));
    }
}
