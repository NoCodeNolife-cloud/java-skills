package com.code;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("./TestDir/build.txt");
             BufferedInputStream bis = new BufferedInputStream(in);
             FileOutputStream out = new FileOutputStream("./TestDir/subDir/build.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {

            long startTime = System.nanoTime();
            byte[] buffer = new byte[1024];
            int len = bis.read(buffer);
            while (len != -1) {

                bos.write(buffer, 0, len);
                len = bis.read(buffer);
            }

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("耗时: " + (elapsedTime / 1000000.0) + "毫秒");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
