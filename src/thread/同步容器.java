package thread;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class 同步容器<T>{
    private final LinkedList<T> list=new LinkedList<>();
    final private int MAX=10;//最多存10个元素
    private  int count=0;

    public synchronized void put(T t)
    {
        while (list.size()==MAX)//想想为什么用where
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        ++count;
        this.notifyAll();//通知消费者线程进行消费
    }

    public synchronized T get()
    {
        T t=null;
        while (list.size()==0)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t=list.removeFirst();
        count--;
        this.notifyAll();//通知生产者进行生产
        return t;
    }

    public static void main(String[] args) {
        同步容器<String> t=new 同步容器<>();

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
