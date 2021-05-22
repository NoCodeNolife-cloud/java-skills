package com.nocodenolife;

import java.io.File;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        File file = new File("Test");

        // 检测文件是否存在
        if (file.exists()) {

            //获取目录文件
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            Date date = new Date(file.lastModified());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
            System.out.println(simpleDateFormat.format(date));

            // 打印目录下文件
            String[] fileList = file.list();
            for (String string : fileList) {

                System.out.println(string);
            }
        } else {

            System.out.println("文件不存在");
        }
    }
}
