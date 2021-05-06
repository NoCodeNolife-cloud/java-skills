package com.code;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(102, "张三");
        map.put(105, "李四");
        map.put(109, "王五");
        map.put(110, "董六");

        System.out.println("--1.使用for-each循环遍历--");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("--2.使用迭代器循环遍历--");
        Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {

            Map.Entry<Integer, String> entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
