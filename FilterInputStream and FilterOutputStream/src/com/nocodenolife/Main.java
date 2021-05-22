package com.nocodenolife;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer>vector=new Vector<>();
        vector.setSize(5);// size
        Scanner scanner=new Scanner(System.in);// scanner

        // write into vector
        for(int i=0;i<vector.size();++i){

            vector.set(i,scanner.nextInt());
        }

        try {

            File file = new File("./src/com/nocodenolife/input.dat");

            // output
            OutputStream outputStream=new FileOutputStream(file);
            FilterOutputStream filterOutputStream=new DataOutputStream(outputStream);

            for(Integer integer:vector){

                outputStream.write(integer);
            }
            filterOutputStream.close();

            // input
            InputStream inputStream = new FileInputStream(file);
            FilterInputStream filterInputStream=new DataInputStream(inputStream);

            int ch;
            while ((ch=filterInputStream.read())!=-1){

                System.out.printf("%5d",ch);
            }

        }catch (IOException e){

            e.printStackTrace();
        }
    }
}
