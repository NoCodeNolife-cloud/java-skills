package com.code;

public class Main {

    public static void main(String[] args) {

        int n1=10;
        int n2=5;

        display(LambdaDemo::add,n1,n2);

        LambdaDemo lambdaDemo=new LambdaDemo();

        display(lambdaDemo::sub,n1,n2);
    }

    public static void display(Calculable _calc,int _n1,int _n2){

        System.out.println(_calc.Calculate(_n1,_n2));
    }
}
