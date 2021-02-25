package thread.thrad1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic类实例 {
   // static volatile int count=0;
    //加了 synchronized后 每次都是100000 保证原子性a

    public static AtomicInteger count=new AtomicInteger(0);
     void m()
    {
        for(int i=0;i<10000;i++)
        {
            count.getAndIncrement();
        }
    }

    public static void main(String[] args) {
        Atomic类实例 t=new Atomic类实例();
        List<Thread> list=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            list.add(new Thread(t::m,"thread"+i));
        }
        list.forEach((o)->o.start());

        list.forEach((o)->{
            try {
                o.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        System.out.println(count.get());
    }
}
