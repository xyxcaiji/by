package thread.马士兵.c_001;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class T_05SinglePool {
    public static void main(String[] args) throws InterruptedException {
        //单例线程池，顾名思义，只有一个活跃的线程池
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println(service);
        for(int i=0;i<2;i++)
        {
            TimeUnit.MILLISECONDS.sleep(500);
            service.execute(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }
        System.out.println(service);
        service.shutdown();
    }
}
