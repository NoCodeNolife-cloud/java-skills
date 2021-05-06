package com.code;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("D");
        set.add("E");

        System.out.println("--1.使用for-each循环遍历--");
        for (String item : set) {

            System.out.println("读取集合元素: " + item);
        }

        System.out.println("--2.使用迭代器遍历--");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {

            System.out.println("读取集合元素: " + it.next());
        }
    }
}
