package 网易;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextLong();
        }
        System.out.println(find(nums));
    }
    public static long find(long[] nums)
    {
        long answer=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1) continue;
            answer+=nums[i]/2;
        }
        return answer;
    }
}
