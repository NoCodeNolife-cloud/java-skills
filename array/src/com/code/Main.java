package com.code;

public class Main {

    public static void main(String[] args) {
        int intArray[]={1,2,3,4,5};

        for(int i=0;i<intArray.length;++i){
            System.out.println("intArray order "+i+" is "+intArray[i]);
        }

        int[] intArray2={11,22,33,44,55};
        int i=0;
        for(int item:intArray2){
            System.out.println("intArray2 order "+i+" is "+intArray2[i]);
            ++i;
        }
        int intArray3[];
        intArray3=new int[5];
        intArray3[0]=10;
        intArray3[1]=11;
        intArray3[2]=12;
        intArray3[3]=13;
        intArray3[4]=14;
        for(int j=0;j<intArray3.length;++j){
            System.out.println("intArray3 order "+j+" is "+intArray3[j]);
        }
    }
}
