package com.code;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set set=new HashSet();

        String b="B";
        set.add("A");
        set.add(b);
        set.add("C");
        set.add(b);
        set.add("E");
        set.add("D");

        System.out.println("集合size = "+set.size());
        System.out.println(set);

        set.remove(b);

        System.out.println("是否包含\"B\"：" + set.contains(b)); // 判断集合是否为空
        System.out.println("set集合是空的：" + set.isEmpty());

        set.clear();
        System.out.println(set);
    }
}
