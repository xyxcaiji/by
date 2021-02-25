package thread.并发;

import com.sun.jndi.toolkit.ctx.StringHeadTail;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class 多线程同时运行 {
    static class Worker implements Runnable{

        CyclicBarrier cyclicBarrier;

        public Worker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }
        @Override
        public void run() {
            try {
                cyclicBarrier.await();//等待其他线程
                System.out.println(Thread.currentThread().getName()+"启动@"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
    public void doTest()
    {
        final int n=5;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(n);
        for(int i=0;i<n;i++)
        {
            new Thread(new Worker(cyclicBarrier)).start();
        }
    }

    public static void main(String[] args) {
        多线程同时运行 d=new 多线程同时运行();
        d.doTest();
    }
}
