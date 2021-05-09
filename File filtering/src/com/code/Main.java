package com.code;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File dir = new File("./TestDir");
        Filter filter = new Filter("html");

        System.out.println("HTML文件目录：" + dir);
        String files[] = dir.list(filter);

        for (String fileName : files) {

            File f = new File(dir, fileName);
            if (f.isFile()) {

                System.out.println("文件名：" + f.getName());
                System.out.println("文件绝对路径：" + f.getAbsolutePath());
                System.out.println("文件路径：" + f.getPath());
            } else {

                System.out.println("子目录：" + f);
            }
        }
    }
}
