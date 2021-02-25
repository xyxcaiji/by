package thread.thrad1.part6;
/*
线程间的通讯
 */
public class Box {
    private int count;
    public Box(int count)
    {
        this.count=count;
    }
    //生产者
    public synchronized void productor()
    {
        if(count>10)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            count++;

            System.out.println(Thread.currentThread().getName()+"生产了一个包子,还有"+count);
            if(count>10)
            {
                this.notifyAll();
            }
        }
    }
    //消费者
    public synchronized void consumer()
    {
        if(count<5)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            count--;
            System.out.println(Thread.currentThread().getName()+"吃了一个包子，还剩下"+count);
            if(count<5)
            {
                this.notifyAll();
            }
        }
    }
}
