package thread;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Demo4 {
    public static void main(String[] args) {
        //ExecutorService pool = Executors.newFixedThreadPool(6);
        //ExecutorService pool = Executors.newSingleThreadExecutor();
        //ScheduledExecutorService pool = Executors.newScheduledThreadPool(6);
        ExecutorService pool = Executors.newCachedThreadPool();
        Runnable target=()->{
            for(int i=0;i<20;i++)
            {
                System.out.println(Thread.currentThread().getName()+"的i的值"+i);
            }
        };
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        //关闭线程
        pool.shutdown();
        AbstractQueuedSynchronizer abstractQueuedSynchronizer;
    }
}
