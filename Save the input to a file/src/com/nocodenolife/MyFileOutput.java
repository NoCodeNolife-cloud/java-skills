package com.nocodenolife;

import java.io.*;

public class MyFileOutput {

    public static void main(String[] args){

        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        int ch;
        try{

            fileInputStream=new FileInputStream(FileDescriptor.in);
            fileOutputStream=new FileOutputStream("output.txt");

            System.out.println("请输入一行字符:");
            while((ch=fileInputStream.read())!='\n'){

                fileOutputStream.write(ch);
            }

            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("文件写入成功");
        }catch (FileNotFoundException e){

            System.out.println("不能创建文件");
        }catch(IOException e){

            System.out.println("输入流有误");
        }
    }
}
