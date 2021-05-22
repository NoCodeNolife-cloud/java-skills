package com.nocodenolife;

import java.io.*;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {

        // 读取文件
        File file=new File("./src/com/nocodenolife/in.txt");
        Vector<Integer>tmpl=new Vector<>();// 保存位置
        ReadFile readFile=new ReadFile(file);

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);



        tmpl= readFile.getValue();

        // 输出到控制台
        for(Integer integer:tmpl){

            System.out.print(integer+" ");
        }
    }
}
