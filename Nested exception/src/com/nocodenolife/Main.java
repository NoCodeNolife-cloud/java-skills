package com.nocodenolife;

/**
 * @author 云非雪
 */
public class Main {

    public static void main(String[] args) {

        try {

            Except.function();
        } catch (Exception e1) {

            System.out.println("这是外层异常嵌套");
            System.out.println(e1);
            System.out.println(e1.getMessage());
            try {

                AnotherExcept.function();
            } catch (Exception e) {

                System.out.println("这是内层异常嵌套");
                System.out.println(e);
                System.out.println(e.getMessage());
            } finally {

                System.out.println("内层异常处理完毕");
            }
        } finally {

            System.out.println("外层嵌套处理完毕");
        }
    }
}
