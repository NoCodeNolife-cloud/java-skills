package com.noCodeNOLife;

public class Outer2 {

    int CommValue = 100;

    static int SV = 200;

    static void stDoSomething() {
    }

    void insDoSomething() {
    }

    private class Inner {

        int inValue;

        void insNothingTODO() {
        }

        public void showSV() {

            inValue = SV;// 访问外部类静态成员
            stDoSomething();// 访问外部静态方法
            insNothingTODO();// 调用本类实例方法
            int k = CommValue;// 访问外部实例成员变量
            insDoSomething();// 调用外部实例方法
        }
    }
}
