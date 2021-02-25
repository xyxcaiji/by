package 腾讯;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        long[] nums=new long[t];
        for(int i=0;i<t;i++)
        {
            nums[i]=scanner.nextInt();
        }
        dinf(nums);
    }
    public static void dinf(long[] nums)
    {
        long[] temp=new long[nums.length];
        long val=0;
        for(int i=0;i<nums.length;i++)
        {
            for(long m=0;m<=nums[i];m++)
            {
                long j=m;
                long k=nums[i]-j;
//                System.out.println(j+"==="+k);
                long t1=0;
                long t2=0;
                do {
                    t1+=j%10;
                    j/=10;
                }while (j>1);
                do {
                    t1+=k%10;
                    k/=10;
                }while (k>1);
                //System.out.println(t1+"=="+t2);
                val=Math.max(t1+t2,val);
                t1=0;
                t2=0;
            }
            temp[i]=val;
            val=0;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
