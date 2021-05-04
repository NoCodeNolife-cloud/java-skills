package com.code;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(5);
        set.add(8);
        set.add(7);
        set.add(10);

        // for type
        for (Object item : set) {

            System.out.println(item);
        }

        System.out.println();

        // iterator
        Iterator pos = set.iterator();
        while (pos.hasNext()) {

            int item = (int) pos.next();
            System.out.println(item);
        }
    }
}
