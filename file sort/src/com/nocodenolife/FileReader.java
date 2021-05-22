package com.nocodenolife;

import java.io.*;
import java.util.Vector;

public class FileReader {

    private DataInputStream dataInputStream;

    // 构造函数
    public FileReader(File file) {

        try {

            FileInputStream fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
        } catch (IOException ignored) {
        }
    }

    // 从文件中读取int
    public Vector<Integer> readFile() {

        Vector<Integer> res = new Vector<>();// 存储

        int tmp;// 缓存
        try {

            while ((tmp = dataInputStream.readInt()) != -1) { //读取

                res.add(tmp);
            }
            dataInputStream.close();
        } catch (IOException ignored) {
        }

        return res;
    }
}
