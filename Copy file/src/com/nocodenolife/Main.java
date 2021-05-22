package com.nocodenolife;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File targetFile = new File("target.txt");

        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        try {

            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(targetFile);
            fileOutputStream =new FileOutputStream(FileDescriptor.out);

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
