package com.noCodeNOLife;

public class Outer1 {

    int CommValue = 100;

    static int SV = 200;

    static void stDosomething() {
    }

    void insDoSomething() {
    }

    public static class NestedButNotInner {

        static int sz = SV;

        int inValue;

        static void stNothingToDO() {
        }

        void insNothingTODO() {
        }

        public void showSV() {

            inValue = SV;// 访问外部类静态成员
            stDosomething();// 调用外部静态方法
            stNothingToDO();// 调用本类静态方法
            insNothingTODO();// 调用本类实例方法
        }
    }
}
