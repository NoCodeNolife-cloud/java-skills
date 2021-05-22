package com.nocodenolife;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class ReadFile {

    private File file;

    public ReadFile(File file){

        this.file=file;
    }

    public Vector<Integer> getValue(){

        Vector<Integer> cnt=new Vector<>();

        try{

            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner=new Scanner(fileInputStream);

            while(scanner.hasNext()){

                cnt.add(scanner.nextInt());
            }

            fileInputStream.close();
        }catch (IOException e){

            e.printStackTrace();
        }

        return cnt;
    }
}
