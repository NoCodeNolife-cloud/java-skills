package com.noCodeNOLife;

public class AnonymousInner {

    static onlyShow st = new onlyShow() {
        public void showMsg() {

            System.out.println("����һ��λ���ⲿ���е������ڲ���.");
        }
    };

    public static void main(String[] args) {

        onlyShow oa = new onlyShow() {

            public void showMsg() {

                System.out.println("����һ��λ�ڷ����е������ڲ���.");
            }
        };
        oa.showMsg();
        st.showMsg();
    }
}
