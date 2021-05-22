package com.nocodenolife;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("in.txt");
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        try {

            fileInputStream = new FileInputStream(file);// open file
            fileOutputStream = new FileOutputStream(FileDescriptor.out);// output

            System.out.println(file.getName() + " 内容为：");
            int ch;
            while ((ch = fileInputStream.read()) != -1) {

                fileOutputStream.write(ch);
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
