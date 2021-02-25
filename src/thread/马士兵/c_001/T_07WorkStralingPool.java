package thread.马士兵.c_001;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class T_07WorkStralingPool {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService service = Executors.newWorkStealingPool();//一般你的cpu是几核，他就会创建几个线程

        //他是daemon线程，意思为守护线程，主线程不阻塞的话你是看不到结果的，想看到结果，你就得阻塞主线程
        service.execute(new R(1000));
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(2000));//执行最后一个任务的一定是第一个线程
        //由于产生的是精灵线程（守护线程，后台线程）主线程不阻塞的话你是看不到结果的，想看到结果，你就得阻塞主线程
        System.in.read();
    }
    static class R implements Runnable{

        int time;
        R(int time){
            this.time=time;
        }
        @Override
        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(time+"..."+Thread.currentThread().getName());
        }
    }
}
