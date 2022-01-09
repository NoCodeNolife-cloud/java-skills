import java.util.concurrent.atomic.AtomicReference;

/**
 * ProjectName: spin lock
 * Author: Administrator
 * Date: 2022/1/8 14:55
 * Description:
 */
public class SpinLock {

    private AtomicReference<Thread> cas;

    public SpinLock(AtomicReference<Thread> cas) {
        this.cas = cas;
    }

    public void lock() {
        Thread current = Thread.currentThread();
        // 利用CAS
        while (!cas.compareAndSet(null, current)) {
            System.out.println("I am spinning");
        }
    }

    public void unlock() {
        Thread current = Thread.currentThread();
        cas.compareAndSet(current, null);
    }

    public static void main(String[] args) {
        AtomicReference<Thread> cas = new AtomicReference<>();
        Thread thread1 = new Thread(new Task1(cas));
        Thread thread2 = new Thread(new Task1(cas));
        thread1.start();
        thread2.start();
    }
}

class Task1 implements Runnable {

    private AtomicReference<Thread> cas;

    private SpinLock slock;

    public Task1(AtomicReference<Thread> cas) {
        this.cas = cas;
        this.slock = new SpinLock(cas);
    }

    @Override
    public void run() {
        slock.lock();
        // slock.lock();   不可重入
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        slock.unlock();
    }
}
