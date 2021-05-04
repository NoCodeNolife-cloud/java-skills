package com.code;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

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

        // for
        for(Object item:map.entrySet()){

            Map.Entry entry=(Map.Entry)item;
            int key= (int) entry.getKey();
            String value=(String)entry.getValue();
            System.out.println(key+":"+value);
        }

        // iterator
        Iterator pos=map.entrySet().iterator();
        while(pos.hasNext()){

            Map.Entry entry=(Map.Entry)pos.next();
            int key= (int) entry.getKey();
            String value=(String)entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
