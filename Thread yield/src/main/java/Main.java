/**
 * ProjectName: Thread yield
 * Author: Administrator
 * Date: 2022/1/10 21:52
 * Description:
 */
public class Main extends Thread {

    public Main(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        Main yt1 = new Main("张三");
        Main yt2 = new Main("李四");
        yt1.start();
        yt2.start();
    }
}