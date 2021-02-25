package thread.thrad1;

import jdk.internal.util.xml.impl.ReaderUTF8;
import qianxin.Tuzi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo4 {
    static class T1 implements Callable<Integer>
    {

        @Override
        public Integer call() throws Exception {
            int re=0;
            for(int i=0;i<100;i++)
            {
                re+=i;
                System.out.println(Thread.currentThread().getName()+"累加到"+i+"是多少"+re);
            }
            return re;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask=new FutureTask<Integer>(new T1());
     //   futureTask.run();
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println(integer);
    }
}
