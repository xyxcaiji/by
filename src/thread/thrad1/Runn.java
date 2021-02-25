package thread.thrad1;

import java.util.concurrent.locks.ReentrantLock;

public class Runn implements Runnable {
    volatile int a=10;
    ReentrantLock lock=new ReentrantLock();
//    @Override
//    public void run() {
//        while (a>0)
//        {
//            synchronized (Object.class){
//                System.out.println(Thread.currentThread().getName()+"==="+a--);
//            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
@Override
public void run() {
    while (true)
    {

        try {
            lock.lock();
            if(a>0)
            {
                System.out.println(Thread.currentThread().getName()+"==="+a--);
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}


    public static void main(String[] args) {
        Runn runn=new Runn();
        for(int i=0;i<3;i++)
        {
            new Thread(runn,"T"+i).start();
        }
    }
}
