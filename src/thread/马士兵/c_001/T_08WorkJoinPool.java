package thread.马士兵.c_001;

import java.io.IOException;
import java.text.FieldPosition;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class T_08WorkJoinPool {
    static final int Max_NUM=5000;
    static int[] nums=new int[100000];
    static Random r=new Random();
    static {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=r.nextInt(100);
        }
        //一个api  把一个数组累加
        System.out.println(Arrays.stream(nums).sum());
    }

    //有两个类可以继承 一个是RecursiveAction
//    static class AddTask extends RecursiveAction{
//        int s,e;
//        AddTask(int start,int end)
//        {
//            this.s=start;
//            this.e=end;
//        }
//        @Override
//        protected void compute() {
//            if(e-s<=Max_NUM)
//            {
//                long sum=0L;
//                for(int i=s;i<e;i++) sum+=nums[i];
//                System.out.println("form:"+s+"to"+e+"="+sum);
//            }
//            else {
//                int middle=(e+s)/2;
//                AddTask addTask = new AddTask(s, middle);
//                AddTask addTask1 = new AddTask(middle, e);
//                addTask.fork();
//                addTask1.fork();
//            }
//        }
//    }
    //另外一个是RecusiveTask<Long>  带返回值
    static class AddTask extends RecursiveTask<Long> {
        int s,e;
        AddTask(int start,int end)
        {
            this.s=start;
            this.e=end;
        }
        @Override
        protected Long compute() {
            if(e-s<=Max_NUM)
            {
                long sum=0L;
                for(int i=s;i<e;i++) sum+=nums[i];
                return sum;
            }
            else {
                int middle=(e+s)/2;
                AddTask addTask = new AddTask(s, middle);
                AddTask addTask1 = new AddTask(middle, e);
                addTask.fork();
                addTask1.fork();

                return addTask.join()+addTask1.join();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ForkJoinPool fjp = new ForkJoinPool();
        AddTask task = new AddTask(0, nums.length);
        fjp.execute(task);
        Long join = task.join();//join 方法本身就是阻塞的，所以不需要主线程阻塞
        System.out.println(join);
//        System.in.read();
    }
}
