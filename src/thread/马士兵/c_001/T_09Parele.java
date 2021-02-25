package thread.马士兵.c_001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T_09Parele {
    static List<Integer> nums= new ArrayList<>();
    static Random r = new Random();
    static {
        for(int i=0;i<10000;i++)
        {
            nums.add( 10000+r.nextInt(10000));
        }
    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        nums.forEach(v->isPrime(v));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        //使用parallel  stream api
        start=System.currentTimeMillis();
        nums.parallelStream().forEach(v->T_09Parele.isPrime(v));
        end=System.currentTimeMillis();
        System.out.println(end-start);

    }
    static boolean isPrime(int nums)
    {
        boolean b;
        if(nums%2==0) return b=false;
        return b=true;
    }
}
