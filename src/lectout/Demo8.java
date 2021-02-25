package lectout;

import java.util.Arrays;
import java.util.Scanner;

/*
 求最多的数
 */
public class Demo8 {
    public static void main(String[] args) {
        //int[] nums={2,2,2,2,2,4,5,3,3,3,3,2,2};
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        findMax(nums);
        //System.out.println(max);
    }
    public static void findMax(int[] nums)
    {
        Arrays.sort(nums);
        int[] temp=new int[nums.length];

        for(int i=0;i<nums.length-1;i++)
        {
            temp[i]=1;
            for(int j=i;j<temp.length-1;j++)
            {
                if(nums[j]==nums[j+1])
                {
                    temp[i]++;
                }else {
                    break;
                }
            }
        }
        int max=nums[0];
        int count=temp[0];
        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]>count)
            {
                max=nums[i];
                count=temp[i];
            }
        }
//        int temp=nums[0];
//        for(int i=1;i<nums.length;i++)
//        {
//            if(nums[i]==temp)
//            {
//                ++count;
//                max=Math.max(count,max);
//            }else{
//                count--;
//                if(count==0)
//                {
//                    temp=nums[i+1];
//                }
//            }
//        }
        System.out.println(max);
        System.out.println(count);
    }
}
