import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * 项目名:  Semaphore
 * 开发者:  Administrator
 * 创建于:  2022 一月 13 星期四 20:46
 * 描述:
 */
public class Customer implements Runnable {
    private Semaphore washbasin;
    private String name;

    public Customer(Semaphore washbasin, String name) {
        this.washbasin = washbasin;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            Random random = new Random();

            // 信号量减一
            washbasin.acquire();
            System.out.println(
                    sdf.format(new Date()) + " " + name + " 开始洗手...");
            // 线程处理中
            Thread.sleep((long) (random.nextDouble() * 5000) + 2000);
            System.out.println(
                    sdf.format(new Date()) + " " + name + " 洗手完毕!");

            // 释放，信号量加一
            washbasin.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
