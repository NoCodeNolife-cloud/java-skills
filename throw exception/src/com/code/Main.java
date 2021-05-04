package com.code;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {

            Date date = readDate();
            System.out.println("读取的日期 = " + date);
        } catch (MyException e) {

            System.out.println("处理IOException...");
            e.printStackTrace();
        }
    }

    public static Date readDate() throws MyException {

        try (
                FileInputStream readfile = new FileInputStream("readme.txt");
                InputStreamReader ir = new InputStreamReader(readfile);
                BufferedReader in = new BufferedReader(ir)
        ) {
            String str = in.readLine();
            if (str == null) {

                return null;
            }

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(str);
        }catch (FileNotFoundException e){

            throw new MyException(e.getMessage());
        }catch(IOException e){

            throw new MyException(e.getMessage());
        }catch(ParseException e){

            throw new MyException(e.getMessage());
        }
    }
}
