package 中兴;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            nums[i]=scanner.nextInt();
//        }
//        count(nums,n);
        System.out.println((double) (3+5+3+7+7+6+6+5+6)/5);
    }
    public static void count(int[] nums,int n)
    {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        int temp=max-min+1;
        int answer=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=temp)
            {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
