package com.code;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(102, "张三");
        map.put(105, "李四");
        map.put(109, "王五");
        map.put(110, "董六");
        map.put(111, "李四");

        // fresh
        map.put(109, "刘备");

        System.out.println("集合size = " + map.size());
        System.out.println(map);

        System.out.println("109 -" + map.get(109));
        System.out.println("108 - " + map.get(108));

        map.remove(109);
        System.out.println("键集合中是否包含109: " + map.containsKey(109));
        System.out.println("值集合中是否包含李四: " + map.containsValue("李四"));

        System.out.println("集合是空的: " + map.isEmpty());

        map.clear();
        System.out.println(map);
    }
}
