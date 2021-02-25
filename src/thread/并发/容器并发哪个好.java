package thread.并发;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class 容器并发哪个好 {
    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<>(); //376
        Map<String,String> map= new ConcurrentHashMap<>();//365
 //       Map<String, String>  map= new Hashtable<>();//488

        Random r=new Random();
        Thread[] threads=new Thread[100];
        CountDownLatch latch=new CountDownLatch(threads.length);

        long start=System.currentTimeMillis();
        for(int i=0;i<threads.length;i++)
        {
            threads[i]=new Thread(()->
            {
                for(int j=0;j<10000;j++) map.put("a"+r.nextInt(10000),"a"+r.nextInt(10000));
                latch.countDown();
            });
        }
        //拉姆达表达式
        Arrays.asList(threads).forEach(t->t.start());
        try {
            //让主线程等着
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
