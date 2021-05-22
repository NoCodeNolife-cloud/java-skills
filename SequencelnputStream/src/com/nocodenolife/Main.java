package com.nocodenolife;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File inputfile1 = new File("./src/com/nocodenolife/in1.txt");
        File inputfile2 = new File("./src/com/nocodenolife/in2.txt");

        FileInputStream fileInputStream1;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream;

        try {

            fileInputStream1 = new FileInputStream(inputfile1);
            fileInputStream2 = new FileInputStream(inputfile2);

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);// sequenceInputStream(InputStream1,InputStream2)

            fileOutputStream = new FileOutputStream(FileDescriptor.out);

            int ch;
            while ((ch = sequenceInputStream.read()) != -1) {

                fileOutputStream.write(ch);
            }

            fileInputStream1.close();
            fileInputStream2.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
