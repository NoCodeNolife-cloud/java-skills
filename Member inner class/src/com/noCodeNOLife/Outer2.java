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

            inValue = SV;// �����ⲿ�ྲ̬��Ա
            stDoSomething();// �����ⲿ��̬����
            insNothingTODO();// ���ñ���ʵ������
            int k = CommValue;// �����ⲿʵ����Ա����
            insDoSomething();// �����ⲿʵ������
        }
    }
}
