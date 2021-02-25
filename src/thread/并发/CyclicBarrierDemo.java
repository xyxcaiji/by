package thread.并发;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    static class Work implements Runnable{
        CyclicBarrier cyclicBarrier;

        public Work(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {

            try {
                System.out.println(Thread.currentThread().getName()+"道道栏杆a");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName()+"冲破栏杆a");

                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+"到达栏杆B");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName()+"冲破栏杆B");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        int n=5;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(n, new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"最后一个到达");
            }
        });
        for(int i=0;i<n;i++)
        {
            new Thread(new Work(cyclicBarrier)).start();
        }
    }
}
