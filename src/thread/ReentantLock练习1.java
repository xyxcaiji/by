package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentantLock练习1 {
    Lock lock=new ReentrantLock();

    void m1()
    {
        try {
            lock.lock();
            for(int i=0;i<10;i++)
            {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("m1"+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void m2()
    {
//        //tyrlock练习1
////        boolean b = lock.tryLock();
////        System.out.println("m2..."+b);

        //trylock 方法2
        boolean locked=false;
        try {
             locked = lock.tryLock(5, TimeUnit.SECONDS);
            System.out.println("m2...."+lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(locked) lock.unlock();
        }

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
        ReentantLock练习1 t=new ReentantLock练习1();
        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(t::m2).start();

    }
}
