package 练习;

import Demo.Lis;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoopIV {
    private static Lock lock = new ReentrantLock();
    public int index = 1;
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void sub1(char c) {
        lock.lock();
        try {
            while (index != 1) {
                try {
                    condition1.await(); //线程一进入等待状态
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.print(c);
            index = 2;//将标记改为2,让线程二满足运行条件
            condition2.signal();//唤醒线程二,说你的条件满足了(index==2),你可以运行了
        } finally {
            lock.unlock();
        }
    }

    public void sub2(char c) {
        lock.lock();
        try {
            while (index != 2) {
                try {
                    condition2.await(); //线程二进入等待状态
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.print(c);
            index = 3;//将标记改为3,让线程三满足运行条件
            condition3.signal();//唤醒线程三,说你的条件满足了(index==3),你可以运行了
        } finally {
            lock.unlock();
        }
    }

    public void sub3(char c) {
        lock.lock();
        try {
            while (index != 3) {
                try {
                    condition3.await(); //线程三进入等待状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           // System.out.print(c+"-");
            index = 1; //将标记改为1,让线程一满足运行条件
            condition1.signal();//唤醒线程一,说你的条件满足了(index==1),你可以运行了
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final LoopIV iv = new LoopIV();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    iv.sub1('A');
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    iv.sub2('B');
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    iv.sub3('C');
                }
            }
        }).start();
    }


}
