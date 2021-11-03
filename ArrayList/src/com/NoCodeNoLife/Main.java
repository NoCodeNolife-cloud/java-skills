package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(5);// add 方法
        arraylist.add(40);
        arraylist.add(9);
        System.out.println("原数组为:");
        for (Integer item : arraylist) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println("测试Collections从大到小排序:");
        Collections.sort(arraylist, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer item : arraylist) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println("测试Collections从小到大排序:");
        Collections.sort(arraylist, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer item : arraylist) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println("测试remove():");
        Integer integer = arraylist.get(0);// 获得指定位置对象
        System.out.println("arraylist在位置0处的对象Integer值为" + arraylist.get(0).toString());
        System.out.println("删除首结点:");
        arraylist.remove(integer);
        for (Integer item : arraylist) {
            System.out.println(item);
        }
        arraylist.add(5);
        arraylist.add(15);

        System.out.println("--------");
        System.out.println("测试set():");
        System.out.println("初始值:");
        for (Integer item : arraylist) {
            System.out.println(item);
        }
        System.out.println("修改arraylist位置为2的值为100:");
        arraylist.set(2, 100);
        for (Integer item : arraylist) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println("测试add():");
        System.out.println("添加5000在index=3中:");
        arraylist.add(3, 5000);
        for (Integer item : arraylist) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println("测试get():");
        System.out.println("index = 4, arrayList.get(4) = " + arraylist.get(4).toString());
        System.out.println("index = 1, arrayList.get(1) = " + arraylist.get(1).toString());

        System.out.println("--------");
        System.out.println("测试removeif():");
        System.out.println("删除偶数:");
        arraylist.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        for (Integer item : arraylist) {
            System.out.println(item);
        }
    }
}
