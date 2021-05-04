package com.code;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();

        String b = "B";

        list.add("A");
        list.add(b);
        list.add("C");
        list.add(b);
        list.add("D");
        list.add("E");

        System.out.println("集合size = " + list.size());
        System.out.println(list);

        System.out.println("indexOf(\"B\") = " + list.indexOf(b));
        System.out.println("lastIndexOf(\"B\") = " + list.lastIndexOf(b));

        list.remove(3);
        System.out.println("remove(3)后: " + list);
        System.out.println("list集合是空的: " + list.isEmpty());

        System.out.println("替换前: " + list);
        list.set(1, "F");
        System.out.println("替换后: " + list);

        list.clear();
        System.out.println(list);

        list.add(1);
        list.add(3);

        int item = (Integer) list.get(0);
    }
}
