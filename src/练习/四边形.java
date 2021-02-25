package 练习;

import java.util.Arrays;
import java.util.Scanner;

public class 四边形 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextLong();
        }
        //System.out.println(Arrays.toString(nums));
        System.out.println(ji(nums));
    }
    public static long ji(long[] nums)
    {
        Arrays.sort(nums);
        long[] temp=new long[2];
        for(int i=nums.length-1;i>=1;i--)
        {
            if(nums[i]==temp[0])
            {
                continue;
            }
            if(nums[i]==nums[i-1])
            {
                if(temp[0]==0) {
                    temp[0]=nums[i];
                    continue;
                }else if(temp[1]==0) {
                    temp[1]=nums[i];
                    break;
                }
            }
        }
        if(temp[0]==0||temp[1]==0)
        {
            return -1;
        }
        //System.out.println(Arrays.toString(temp));
        return temp[0]*temp[1];
    }
}
