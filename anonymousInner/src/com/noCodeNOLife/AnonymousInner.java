package com.noCodeNOLife;

public class AnonymousInner {

    static onlyShow st = new onlyShow() {
        public void showMsg() {

            System.out.println("这是一个位于外部类中的匿名内部类.");
        }
    };

    public static void main(String[] args) {

        onlyShow oa = new onlyShow() {

            public void showMsg() {

                System.out.println("这是一个位于方法中的匿名内部类.");
            }
        };
        oa.showMsg();
        st.showMsg();
    }
}
