package thread;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 同步容器改良之reentlock<T>{
    private final LinkedList<T> list=new LinkedList<>();
    final private int MAX=10;//最多存10个元素
    private  int count=0;

    private Lock lock=new ReentrantLock();
    private Condition producer=lock.newCondition();
    private Condition consumer=lock.newCondition();

    public  void put(T t)
    {
        try {
            lock.lock();
            while (list.size()==MAX)//想想为什么用where
            {
                    producer.await();
            }
            list.add(t);
            ++count;
            consumer.signalAll();//通知消费者线程进行消费
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public  T get()
    {
        T t=null;
        try {
            lock.lock();
            while (list.size()==0)
            {
                    consumer.await();
            }
            t=list.removeFirst();
            count--;
            producer.signalAll();//通知生产者进行生产
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


        return t;
    }

    public static void main(String[] args) {
        同步容器改良之reentlock<String> t=new 同步容器改良之reentlock<>();

        for(int i=0;i<10;i++)
        {
            new Thread(()->{
                for(int j=0;j<5;j++) System.out.println(t.get());
            }).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0;i<2;i++)
        {
            new Thread(()->{
                for(int j=0;j<25;j++) t.put(Thread.currentThread().getName()+" "+j);
            }).start();
        }
    }
}
