package thread.并发;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class 写时复制 {
    public static void main(String[] args) {
        //List list=new ArrayList();
        List<String> list=
                //new Vector();//314 这是100个线程
                new CopyOnWriteArrayList<>();//5155 这还是只有10个线程
        Thread[] threads=new Thread[10];
        Random r=new Random();
        for(int i=0;i<threads.length;i++)
        {
//            Thread thread= new Thread(()->{
//                for(int j=0;j<10000;j++) list.add(".."+r.nextInt(10000));
//            });
            Runnable runnable= new Runnable(){
                @Override
                public void run() {
                    for(int j=0;j<10000;j++) list.add(".."+r.nextInt(10000));
                }
            };
            threads[i]=new Thread(runnable);
        }
        System.out.println(tunadnTime(threads));
        System.out.println(list.size());
    }
    static long tunadnTime(Thread[] threads) {
        long start = System.currentTimeMillis();
      //  for (int i = 0; i < threads.length; i++) threads[i].start();
        Arrays.asList(threads).forEach(t->t.start());
        Arrays.asList(threads).forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        return end - start;
    }
}
