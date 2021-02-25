package thread.马士兵.c_001;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class T_06ScheduelPoolThread {
    public static void main(String[] args) {
        //定时执行线程
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

        scheduledExecutorService.scheduleAtFixedRate(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        },0,500,TimeUnit.MILLISECONDS);

    }
}
