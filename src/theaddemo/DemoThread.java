package theaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/*
 主线程如何捕获 子线程的异常 记住  美团失败记里面有

 */
public class DemoThread {
    public static void main(String[] args) {

            Thread thread = new Thread(new ThreadExceptionRunner());
            thread.start();
        System.out.println(123);

        //3：通过Executors.newCachedThreadPool把第二步骤的类加进去，这样 你就可以捕获自定义的异常啦，孩子，去用吧
//        ExecutorService exec = Executors.newCachedThreadPool(new HandleThreadFactory());
//        exec.execute(new ThreadExceptionRunner());
//        exec.shutdown();
//        String[][] string={{"A1-A11","A2-A12","A3-A13"},
//                {"B1-B11","B2-B12","B3-B13"},
//                {"C1-C11","C2-C12","C3-C13"}
//        };
//        int j=0;
//        for(int i=0;i<string.length;i++)
//        {
//
//            while(<string.length)
//            {
//                System.out.println(string[i][j].substring(3,6));
//                j+=1;
//            }
//            j=0;
//        }

//        int[] nums={6,5,2,8,3,6,1,2,1,5,3};
//        int max=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            max=Math.max(max,nums[i]);
//        }
//        int[] temp=new int[max+1];
//        for(int i=0;i<nums.length;i++)
//        {
//            temp[nums[i]]+=1;
//        }
//        for(int i=0;i<temp.length;i++)
//        {
//            if(temp[i]==1)
//            {
//                System.out.println(temp[i]);
//            }
//        }
    }

}
//1:首先  实现一个 Thread.UccaugthExceptionHandler
//在里面自定义你要 捕获的的格式
class MyUncaughtExceptionHandle implements Thread.UncaughtExceptionHandler
{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("zidingyi"+e);
    }
}
//2：其次  实现 ThradFactory  把自定义的格式加进去
class HandleThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("create thread t");
        Thread thread=new Thread(r);
        System.out.println("set uncaughtException for t");
        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandle());
        return thread;
    }
}
