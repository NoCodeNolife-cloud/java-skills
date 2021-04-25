package com.code;

public class Main {

    public static void main(String[] args) {
        int i=0;
        int a=10;
        int b=9;

        if((a>b)||(i==1)){
            System.out.println("或运算为 真");
        }else{
            System.out.println("或运算为 假");
        }

        if((a<b)&&(i==1)){
            System.out.println("与运算为 真");
        }else{
            System.out.println("与运算为 假");
        }

        // 条件表达中掺杂了++和—运算，由于(a > b)是true，后面的表达式(a++ == --b)不再计算，所以最后是a = 10, b = 9。
        if((a>b)||(a++==--b)){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }
}
