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

            inValue = SV;// �����ⲿ�ྲ̬��Ա
            stDosomething();// �����ⲿ��̬����
            stNothingToDO();// ���ñ��ྲ̬����
            insNothingTODO();// ���ñ���ʵ������
        }
    }
}
