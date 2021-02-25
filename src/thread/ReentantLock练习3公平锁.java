package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentantLock练习3公平锁 extends Thread{
    //公平锁
    private ReentrantLock reentrantLock=new ReentrantLock(true);
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"得到锁");
                //1得到一下 2得到一下 按照时间来分配锁
                /*
                Thread-1得到锁
Thread-2得到锁
Thread-1得到锁
Thread-2得到锁
Thread-1得到锁
Thread-2得到锁
Thread-1得到锁
Thread-2得到锁
                 */
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentantLock练习3公平锁 t=new ReentantLock练习3公平锁();
        Thread thread=new Thread(t);
        Thread thread1=new Thread(t);
        thread.start();
        thread1.start();
    }
}
