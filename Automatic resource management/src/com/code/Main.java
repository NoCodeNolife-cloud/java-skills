package com.code;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = readDate();
        System.out.println("读取的日期  = " + date);
    }

    public static Date readDate() {
        // 自动资源管理
        try (FileInputStream readfile = new FileInputStream("readme.txt");
             InputStreamReader ir = new InputStreamReader(readfile);
             BufferedReader in = new BufferedReader(ir)) {

            // 读取文件中的一行数据
            String str = in.readLine();
            if (str == null) {

                return null;
            }

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(str);
        } catch (FileNotFoundException e) {

            System.out.println("处理FileNotFoundException...");
            e.printStackTrace();
        } catch (IOException e) {

            System.out.println("处理IOException...");
            e.printStackTrace();
        } catch (ParseException e) {

            System.out.println("处理ParseException...");
            e.printStackTrace();
        }

        return null;
    }
}
