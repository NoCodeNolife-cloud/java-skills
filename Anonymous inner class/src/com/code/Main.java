package com.code;

public class Main {

    public static void main(String[] args) {

        View v=new View();

        // 方法参数是匿名内部类
        v.handler(new OnclickListener() {

            @Override
            public void onClick() {

                System.out.println("实现接口的匿名内部类...");
            }
        });
    }
}
