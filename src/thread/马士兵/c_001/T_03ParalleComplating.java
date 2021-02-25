package thread.马士兵.c_001;

import Demo.Lis;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import javax.xml.stream.events.EndDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class T_03ParalleComplating {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //一个线程执行
        long start=System.currentTimeMillis();
        List<Integer> prime = getPrime(1, 200000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<List<Integer>> submit = service.submit(new zhi(1, 80000));
        Future<List<Integer>> submit1 = service.submit(new zhi(80001, 130000));
        Future<List<Integer>> submit2 = service.submit(new zhi(130001, 170000));
        Future<List<Integer>> submit3 = service.submit(new zhi(170001, 200000));

        start = System.currentTimeMillis();
        List<Integer> list = submit.get();
        List<Integer> list1 = submit1.get();
        List<Integer> list2 = submit2.get();
        List<Integer> list3 = submit3.get();
        end=System.currentTimeMillis();
        System.out.println(end-start);

        service.shutdown();
    }

    static class zhi implements Callable<List<Integer>> {
        int startPos,endPos;
        zhi(int s,int e)
        {
            this.startPos=s;
            this.endPos=e;
        }


        @Override
        public List<Integer> call() throws Exception {
            List<Integer> list=getPrime(startPos,endPos);
            return list;
        }

    }
    static boolean ifPrime(int num){
        for(int i=2;i<num/2;i++)
        {
            if(num%2==0) return false;
        }
        return true;
    }
    static List<Integer> getPrime(int start,int num)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=start;i<num;i++)
        {
            if(ifPrime(i)) list.add(i);
        }
        return list;
    }
}
