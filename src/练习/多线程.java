package 练习;

import java.util.concurrent.locks.ReentrantLock;

public class 多线程 {
    public static void main(String[] args) {
        Runnable runnable= new Runnable(){
            private ReentrantLock roo=new ReentrantLock(true);
            @Override
            public void run() {
                int i=10;
                while (i>0)
                {
                    try {
                        roo.lock();
                        System.out.println(Thread.currentThread().getName()+"reentrantLock"+i);
                    } finally {
                        roo.unlock();
                    }
                    i--;
                }
            }
        };
        Thread thread=new Thread(runnable,"t1");
        Thread thread2=new Thread(runnable,"t2");
        thread.start();
        thread2.start();
        //ReentrantLock roo=new ReentrantLock(true);

    }
}
