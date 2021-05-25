package com.nocodenolife;

import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // 生成数组
        Vector<Integer> vector1 = new Vector<>();
        Vector<Double> vector2 = new Vector<>();

        // 数组大小
        vector1.setSize(10);
        vector2.setSize(10);

        // 随机数
        Random random = new Random();

        // 初始化
        for (int i = 0; i < vector1.size(); ++i) {

            vector1.set(i, random.nextInt(100));
        }

        for (int i = 0; i < vector2.size(); ++i) {

            vector2.set(i, random.nextDouble() * 100);
        }

        // 打印输出数组
        System.out.println("vector1:");
        printVector(vector1);
        System.out.println();

        System.out.println("vector2:");
        printVector(vector2);
        System.out.println();

        // 生成Num
        Num num1 = new Num(vector1);
        Num num2 = new Num(vector2);

        // getAvg
        System.out.println("The average of vector1 = " + num1.getAvg());
        System.out.println("The average of vector2 = " + num2.getAvg());
    }

    public static <T> void printVector(Vector<T> vector) {

        for (T item : vector) {

            System.out.print(item + " ");
        }
    }
}
