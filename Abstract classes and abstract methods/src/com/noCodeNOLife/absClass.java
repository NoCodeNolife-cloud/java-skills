package com.noCodeNOLife;

abstract class absClass {

    // ����һ�����󷽷�
    abstract public void absfun();

    // ��ͨʵ������
    public void instance() {

        System.out.println("����һ����ͨ��ʵ������");
    }

    // ��ͨ��̬����
    public static void stFun() {

        System.out.println("����һ����ͨ�ľ�̬����");
    }
}
