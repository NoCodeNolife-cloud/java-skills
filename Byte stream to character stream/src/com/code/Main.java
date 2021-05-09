package com.code;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(FileInputStream fis=new FileInputStream("./TestDir/JButton.html");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader bis=new BufferedReader(isr);
            FileOutputStream fos=new FileOutputStream("./TestDir/subDir/JButton.html");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bos=new BufferedWriter(osw)){

            String line=bis.readLine();
            while(line!=null){

                // 开始写入数据
                bos.write(line);
                // 写入换行符
                bos.newLine();
                // 再读取一行文本
                line=bis.readLine();
            }
            System.out.println("复制完成");
        } catch(IOException e){

            e.printStackTrace();
        }
    }
}
