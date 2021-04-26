package com.code;

public class Main {

    public static void main(String[] args) {
        int i=0;
        do{
            i++;
        }while(i*i<100000);

        System.out.println("i = "+i);
        System.out.println("i * i = "+(i*i));
    }
}
