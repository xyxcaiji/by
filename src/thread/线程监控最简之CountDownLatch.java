package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/*
  实现一个容器,提供两个方法,add,size
  写两个线程,线程1添加10个元素到容器,线程2实现监控元素的个数,到第五个元素是,线程2提示并结束
 */
public class 线程监控最简之CountDownLatch {
    volatile List list=new ArrayList();

    public void add(Object o)
    {
        list.add(o);
    }
    public int size()
    {
       return list.size();
    }

    public static void main(String[] args) {
        线程监控最简之CountDownLatch t=new 线程监控最简之CountDownLatch();

        //1时门闩数量 为1
        CountDownLatch latch=new CountDownLatch(1);
        System.out.println("t1启动");
        System.out.println("t2启动");
        new Thread(()->{
            if(t.size()!=5)
            {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t2结束");
        }).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            for(int i=0;i<10;i++)
            {
                t.add(new Object());
                System.out.println("add"+i);
                if(t.size()==5)
                {
                    latch.countDown();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        },"t1").start();


    }
}
