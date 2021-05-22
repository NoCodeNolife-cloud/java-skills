package com.nocodenolife;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {

        int ch;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);

        try {

            System.out.println("请输入一行字符:");
            while ((ch = inputStreamReader.read()) != '\n') {

                outputStreamWriter.write(ch);
            }

            // 如果不关闭输出流，屏幕上不会有任何显示
            outputStreamWriter.close();
            inputStreamReader.close();
        } catch (IOException ignored) {

        }
    }
}
