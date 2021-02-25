package thread.马士兵.c_001;

import java.util.concurrent.*;

public class T_02FutureTast {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //FutureTask  未来方法， 里面实现的是callable 有返回值
        FutureTask<Integer> futureTask=new FutureTask<Integer>(()->{
            TimeUnit.MILLISECONDS.sleep(500);
            return 1000;
        });

        new Thread(futureTask).start();
        System.out.println(futureTask.get());//阻塞

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> task = service.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });
        System.out.println(task.isDone());//任务执行完没有啊
        System.out.println(task.get());//get是阻塞方法
        System.out.println(task.isDone());
        System.out.println(task.isCancelled());
        service.shutdown();
    }
}
