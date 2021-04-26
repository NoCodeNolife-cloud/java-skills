package com.code;

public class Main {

    public static void main(String[] args) {
        int doubleArray[][]={{1,2,3},{11,12,13},{21,22,23},{31,32,33}};// Static initialization

        for(int i=0;i<doubleArray.length;++i){
            for(int j=0;j<doubleArray[0].length;++j){
                System.out.printf("%-5s",doubleArray[i][j]);
            }
            System.out.println();
        }
    }
}
