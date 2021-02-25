package thread.马士兵.c_001;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor练习 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        for(int i=0;i<6;i++)
        {
            fixedThreadPool.execute(()->{
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"i");
            });
        }
        System.out.println(fixedThreadPool);

        fixedThreadPool.shutdown();//所有线程执行完关闭
        System.out.println(fixedThreadPool.isTerminated());//任务是不是都执行完了
        System.out.println(fixedThreadPool.isShutdown());//是不是在关闭
        System.out.println(fixedThreadPool);

        TimeUnit.SECONDS.sleep(5);

        System.out.println(fixedThreadPool.isTerminated());
        System.out.println(fixedThreadPool.isShutdown());
        System.out.println(fixedThreadPool);
    }
}
