package thread.thrad1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
  实现一个容器,提供两个方法,add,size
  写两个线程,线程1添加10个元素到容器,线程2实现监控元素的个数,到第五个元素是,线程2提示并结束
 */
public class 线程监控 {
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
        线程监控 t=new 线程监控();
        new Thread(()->{
            for(int i=0;i<10;i++)
            {
                t.add(new Object());
                System.out.println("add"+i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        },"t1").start();

        new Thread(()->{
            while (true)
            {
                if(t.size()==5)
                {
                    break;
                }

            }
            System.out.println("t2结束");
        }).start();
    }
}
