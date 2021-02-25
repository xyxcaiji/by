package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "的循环变量i" + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName()+"的循环变量i为"+i);
            if(i==20)
            {
                new Thread(task,"有返回值的线程").start();
            }

        }

        System.out.println("子线程的返回值");
    }
}
