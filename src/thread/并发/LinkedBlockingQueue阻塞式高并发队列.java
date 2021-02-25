package thread.并发;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueue阻塞式高并发队列 {
    static LinkedBlockingQueue link=new LinkedBlockingQueue();
    static Random r = new Random();

    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<10;i++)
            {
                try {
                    //put 如果满了,就不会再加,会阻塞
                    link.put("a"+i);
                    TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for(int i=0;i<5;i++)
        {
            new Thread(()->{
                for(;;)
                {
                    try {
                        //take 如果取完了,那么就会 阻塞  不再取
                        System.out.println(Thread.currentThread().getName()+link.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
