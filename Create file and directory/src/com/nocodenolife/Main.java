package com.nocodenolife;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // 创建目录
        File directory = new File("Dir");
        directory.mkdir();

        // 创建文件
        File file = new File(directory, "resource.txt");
        file.createNewFile();
    }
}
