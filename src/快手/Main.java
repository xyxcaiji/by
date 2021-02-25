package 快手;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums={175, 173, 174, 163, 182, 177};
        int[] ints = find(nums);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] find(int[] nums)
    {
        int[] di=new int[nums.length];
        di[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]>nums[i])
                {
                    di[i]=i-j;
                    break;
                }
            }
        }
        return di;
    }
}
