package com.nocodenolife;

import java.io.*;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {

        Vector<Point> vector = new Vector<>();// 数组
        vector.setSize(10);// 设置大小

        // 初始化
        Random random = new Random();
        for (int i = 0; i < vector.size(); ++i) {
            vector.set(i, new Point(random.nextInt(100), random.nextInt(100)));
        }

        // 保存于文件中
        File file = new File("src/com/nocodenolife/resource.bin");// 文件
        FileOutputStream fileOutputStream = new FileOutputStream(file);// FileOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);// ObjectOutputStream
        for (Point point : vector) {

            objectOutputStream.writeObject(point);
        }
        objectOutputStream.close();

        // 清除数组内数据
        vector.clear();

        // 读取文件内部数据
        FileInputStream fileInputStream = new FileInputStream(file);// FileInputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);// ObjectInputStream

        try {

            Point tmp;
            while ((tmp = (Point) objectInputStream.readObject()) != null) {

                vector.add(tmp);
            }
        } catch (ClassNotFoundException | IOException ignored) {

        }

        printVector(vector);// 打印文件内部数据

        // 对数据进行操作
        VectorSort.bubbleSort(vector);

        // 打印文件内部数据
        System.out.println("排序后");
        printVector(vector);
    }

    private static <T> void printVector(Vector<T> vector) {

        for (T t : vector) {

            System.out.println(t.toString());
        }
    }
}
