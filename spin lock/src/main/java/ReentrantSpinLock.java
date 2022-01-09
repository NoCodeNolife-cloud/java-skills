import java.util.concurrent.atomic.AtomicReference;

/**
 * ProjectName: spin lock
 * Author: Administrator
 * Date: 2022/1/8 19:57
 * Description:
 */
public class ReentrantSpinLock {
    private AtomicReference<Thread> cas = new AtomicReference<Thread>();
    private int count;// 计数

    public ReentrantSpinLock(AtomicReference<Thread> cas) {
        this.cas = cas;
    }

    public void lock() {
        Thread current = Thread.currentThread();
        if (current == cas.get()) { // 如果当前线程已经获取到了锁，线程数增加一，然后返回
            count++;
            return;
        }
        // 如果没获取到锁，则通过CAS自旋
        while (!cas.compareAndSet(null, current)) {
            // DO nothing
        }
    }

    public void unlock() {
        Thread cur = Thread.currentThread();
        if (cur == cas.get()) {
            if (count > 0) {// 如果大于0，表示当前线程多次获取了该锁，释放锁通过count减一来模拟
                count--;
            } else {// 如果count==0，可以将锁释放，这样就能保证获取锁的次数与释放锁的次数是一致的了。
                cas.compareAndSet(cur, null);
            }
        }
    }

    public static void main(String[] args) {
        AtomicReference<Thread> cas = new AtomicReference<>();
        Thread thread1 = new Thread(new Task2(cas));
        Thread thread2 = new Thread(new Task2(cas));
        thread1.start();
        thread2.start();
    }
}

class Task2 implements Runnable {

    private AtomicReference<Thread> cas;

    private ReentrantSpinLock slock;

    public Task2(AtomicReference<Thread> cas) {
        this.cas = cas;
        this.slock = new ReentrantSpinLock(cas);
    }

    @Override
    public void run() {
        slock.lock();
        slock.lock();// 可重入
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        slock.unlock();
        slock.unlock();// 再加一个unlock将多余的锁计数归零
    }
}
