package qinanxin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(",");
        System.out.println(Arrays.toString(s1));
        int[] nums=new int[s1.length];

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Integer.parseInt(s1[i]);
        }
        findMan(nums);
    }
    public static void findMan(int[] nums)
    {
       int a,b,c;
       a=nums[0]+nums[1]+nums[2]+nums[3];
       b=nums[3]+nums[4]+nums[5]+nums[6];
       c=nums[6]+nums[7]+nums[8]+nums[0];
       if(a==b&&b==c)
       {
           System.out.println("yes");
       }else {
           System.out.println("no");
       }
    }
}
