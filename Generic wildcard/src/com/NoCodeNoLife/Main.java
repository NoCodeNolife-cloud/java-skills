package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyWrapper myWrapper = new MyWrapper(25, 27.5);
        MyWrapper myWrapper1 = new MyWrapper(30, 32.5);
        LinkedList<MyWrapper> list = new LinkedList<>();
        list.add(myWrapper);
        list.add(myWrapper1);
        show(list);
    }

    public static void show(LinkedList<? extends MyClass> e) {
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i).toString());
        }
    }
}
