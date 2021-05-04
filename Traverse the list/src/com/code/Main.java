package com.code;

import java.util.ArrayList;
import java.util.Iterator;
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

        // 使用for循环遍历
        for (int i = 0; i < list.size(); ++i) {

            System.out.printf("读取集合元素(%d): %s \n", i, list.get(i));
        }

        // 使用for-each循环遍历
        for (Object item : list) {

            String str = (String) item;
            System.out.println("读取集合元素: " + str);
        }

        // 使用迭代器遍历
        Iterator iter = list.iterator();
        while (iter.hasNext()) {

            Object item = iter.next();
            String str = (String) item;
            System.out.println("读取集合元素: " + str);
        }
    }
}
