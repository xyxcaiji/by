package thread.线程池ThreadPool;

import java.nio.channels.Pipe;
import java.util.concurrent.*;

public class 线程池ThreadPool {
    public static void main(String[] args) {
        t1();
    }
    //new SynchronousQueue<Runnable>()
    //直接提交队列
    public static void t1()
    {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,4,
                60, TimeUnit.SECONDS,new SynchronousQueue<Runnable>(),
                Executors.defaultThreadFactory(),new  ThreadPoolExecutor.CallerRunsPolicy());
        for(int i=0;i<5;i++)
        {
            pool.execute(new ThreadTask());
            //System.out.println(pool);
        }
        /**
         * "C:\Program Files\Java\jdk1.8.0_144\bin\java.exe" -Dvisualvm.id=2349013122133300 "-javaagent:D:\IDEA\idea20182\IntelliJ IDEA 2018.2.4\lib\idea_rt.jar=61143:D:\IDEA\idea20182\IntelliJ IDEA 2018.2.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;D:\IDEA\work1\out\production\work1" thread.线程池ThreadPool.线程池ThreadPool
         * Exception in thread "main" java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 0]
         * java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]
         * java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 3, active threads = 3, queued tasks = 0, completed tasks = 0]
         * java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 4, active threads = 4, queued tasks = 0, completed tasks = 0]
         * java.util.concurrent.RejectedExecutionException: Task thread.线程池ThreadPool.ThreadTask@45ee12a7 rejected from java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 4, active threads = 4, queued tasks = 0, completed tasks = 0]
         * 	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2063)
         * 	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:830)
         * 	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1379)
         * 	at thread.线程池ThreadPool.线程池ThreadPool.t1(线程池ThreadPool.java:16)
         * 	at thread.线程池ThreadPool.线程池ThreadPool.main(线程池ThreadPool.java:7)
         * pool-1-thread-1
         * pool-1-thread-2
         * pool-1-thread-3
         * pool-1-thread-4
         */
    }
    //有界队列
    public static void t2()
    {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1,2,
                60, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(4),
                Executors.defaultThreadFactory(),new  ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<10;i++)
        {
            pool.execute(new ThreadTask());
            //System.out.println(pool);
        }
    }
    //无界队列
    //new LinkedBlockingQueue<Runnable>()
    public static void t3()
    {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1,2,
                60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(),
                Executors.defaultThreadFactory(),new  ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<10;i++)
        {
            pool.execute(new ThreadTask());
            //System.out.println(pool);
        }
    }
    //优先任务队列
    //new PriorityBlockingQueue<Runnable>()
    public static void t4()
    {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1,2,
                60, TimeUnit.SECONDS,new PriorityBlockingQueue<Runnable>(),
                Executors.defaultThreadFactory(),new  ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<20;i++)
        {
            pool.execute(new ThreadTask(i));
            //System.out.println(pool);
        }
        pool.shutdown();
    }
    /**
     * "C:\Program Files\Java\jdk1.8.0_144\bin\java.exe" -Dvisualvm.id=2350135846009700 "-javaagent:D:\IDEA\idea20182\IntelliJ IDEA 2018.2.4\lib\idea_rt.jar=61502:D:\IDEA\idea20182\IntelliJ IDEA 2018.2.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;D:\IDEA\work1\out\production\work1" thread.线程池ThreadPool.线程池ThreadPool
     * priority:0,ThreadName:pool-1-thread-1
     * priority:19,ThreadName:pool-1-thread-1
     * priority:18,ThreadName:pool-1-thread-1
     * priority:17,ThreadName:pool-1-thread-1
     * priority:16,ThreadName:pool-1-thread-1
     * priority:15,ThreadName:pool-1-thread-1
     * priority:14,ThreadName:pool-1-thread-1
     * priority:13,ThreadName:pool-1-thread-1
     * priority:12,ThreadName:pool-1-thread-1
     * priority:11,ThreadName:pool-1-thread-1
     * priority:10,ThreadName:pool-1-thread-1
     * priority:9,ThreadName:pool-1-thread-1
     * priority:8,ThreadName:pool-1-thread-1
     * priority:7,ThreadName:pool-1-thread-1
     * priority:6,ThreadName:pool-1-thread-1
     * priority:5,ThreadName:pool-1-thread-1
     * priority:4,ThreadName:pool-1-thread-1
     * priority:3,ThreadName:pool-1-thread-1
     * priority:2,ThreadName:pool-1-thread-1
     * priority:1,ThreadName:pool-1-thread-1
     */

}
class ThreadTask implements Runnable,Comparable<ThreadTask>{

    private int priority;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ThreadTask() {

    }

    public ThreadTask(int priority) {
        this.priority = priority;
    }

    //当前对象和其他对象做比较，当前优先级大就返回-1，优先级小就返回1,值越小优先级越高
    public int compareTo(ThreadTask o) {
        return  this.priority>o.priority?-1:1;
    }

    public void run() {
        try {
            //让线程阻塞，使后续任务进入缓存队列
            Thread.sleep(1000);
            System.out.println("priority:"+this.priority+",ThreadName:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}