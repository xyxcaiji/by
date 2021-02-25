package thread;
/*
线程优先级
 */
public class Demo2 extends Thread{
    public Demo2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            System.out.println(getName()+"优先级是"+getPriority()+"循环变量的值是"+i);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for(int i=0;i<30;i++)
        {
            if(i==10)
            {
                Demo2 demo2=new Demo2("低级");
                demo2.start();
                System.out.println("创建开始的优先级"+demo2.getPriority());
                demo2.setPriority(Thread.MIN_PRIORITY);
            }

            if(i==20)
            {
                Demo2 high=new Demo2("高级");
                high.start();
                System.out.println("创建开始的优先级"+high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
