package com.nocodenolife;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File resourcesfile = new File("./src/com/nocodenolife/resources.dat");
        File targetfile = new File("./src/com/nocodenolife/target.dat");

        try {

            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(resourcesfile));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(targetfile));

            int ch;
            while ((ch = inputStreamReader.read()) != -1) {

                outputStreamWriter.write(ch);
            }

            // 必须关闭流对象
            outputStreamWriter.close();
            inputStreamReader.close();
        } catch (IOException ignored) {

        }

    }
}
