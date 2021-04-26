package com.code;

public class Main {

    public static void main(String[] args) {
        int intArray[][]=new int[4][];

        intArray[0]=new int[2];
        intArray[1]=new int[1];
        intArray[2]=new int[3];
        intArray[3]=new int[3];

        for(int i=0;i<intArray.length;++i){
            for(int j=0;j<intArray[i].length;++j){
                intArray[i][j]=i+j;
            }
        }

        for(int []row:intArray){
            for(int column:row){
                System.out.print(column);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
