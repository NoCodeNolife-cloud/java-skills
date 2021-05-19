package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        // declare then initialize
        int a[];
        a = new int[5];
        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
        }
        System.out.println("a:");
        for (Integer item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

        // declare and initialize
        int b[] = new int[10];
        for (int i = 0; i < b.length; ++i) {
            b[i] = i;
        }
        System.out.println("b:");
        for (Integer item : b) {
            System.out.print(item + " ");
        }
        System.out.println();

        // clone method
        int c[] = (int[]) b.clone();
        System.out.println("c:");
        for (Integer item : c) {
            System.out.print(item + " ");
        }
        System.out.println();

        // change c
        c[3]=100;
        System.out.println("after change, c:");
        for(Integer item:c){
            System.out.print(item + " ");
        }
        System.out.println();

        // reference to an array
        int d[]=c;
        System.out.println("reference d:");
        for(Integer item:d){
            System.out.print(item + " ");
        }
        System.out.println();

        // change d
        d[4]=400;
        System.out.println("after change, d:");
        for(Integer item:d){
            System.out.print(item + " ");
        }
        System.out.println();

        // print c
        System.out.println("c:");
        for(Integer item:c){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}