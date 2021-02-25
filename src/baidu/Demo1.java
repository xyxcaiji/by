package baidu;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
//        System.out.println(Arrays.toString(nums));
        System.out.println(findStep(nums,n));
    }
    public static int findStep(int[] nums,int n)
    {
        if(n<2||n>50) return 0;
        int step=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<n) continue;
            while (nums[i]>=n)
            {
                step+=1;
                nums[i]-=n;
                jia(nums,i);
            }
        }
        return step;
    }
    public static void jia(int[] nums,int n)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(i==n) continue;
            nums[i]=nums[i]+1;
        }
    }
}
