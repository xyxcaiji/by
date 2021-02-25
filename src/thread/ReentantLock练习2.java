package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentantLock练习2 {


    void m1()
    {

    }
    void m2()
    {


//        try {
//            lock.lock();
//            for(int i=0;i<10;i++)
//            {
//                TimeUnit.SECONDS.sleep(1);
//                System.out.println("m2"+i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
    }

    public static void main(String[] args)  {
       // ReentantLock练习2 t=new ReentantLock练习2();
        Lock lock=new ReentrantLock();
       Thread t1= new Thread(()->{
            try {
                lock.lock();
                System.out.println("t1启动..");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            } catch (Exception e) {
                System.out.println("Interruptibly");
            } finally {
                lock.unlock();
            }
        });
       t1.start();
        Thread t2= new Thread(()->{
            boolean b=false;
            try {
                b = lock.tryLock();
                lock.lockInterruptibly();//会响应interrupt()

                System.out.println("t2启动");
                System.out.println("t1启动");
            } catch (InterruptedException e) {
                System.out.println("Interruptibly");
             //   e.printStackTrace();
            }finally {
                if(b) lock.unlock();
            }
        });

        t2.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.interrupt();
    }
}
