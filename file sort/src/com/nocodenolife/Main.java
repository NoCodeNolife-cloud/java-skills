package com.nocodenolife;

import java.io.File;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // file
        File file = new File("./src/com/nocodenolife/source.txt");

        Vector<Integer> vector;

        // 文件载入vector
        FileReader fileReader = new FileReader(file);
        vector = fileReader.readFile();

        // 打印数据
        for (Integer integer : vector) {

            System.out.print(integer + " ");
        }
        System.out.println();

        VectorSort.sort(vector);

        // 打印数据
        for (Integer integer : vector) {

            System.out.print(integer + " ");
        }
        System.out.println();

        // 输出到文件
        FileWritter fileWritter = new FileWritter(file);
        fileWritter.writeFile(vector);
    }
}
