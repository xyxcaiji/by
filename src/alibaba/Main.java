package alibaba;

import java.util.Scanner;

public class Main {
    static int sum=0;
    static int wei=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findMax(nums,n));
    }
    public static int findMax(int[] nums,int n)
    {
        if(nums.length<=1) return nums[0];
        for(int i=0;i<n-1;)
        {
            if(nums[0]<=0) return sum;
            if(nums[i]==0){
                findMax(nums,i-1);
            }
            if(nums[i+1]>=nums[i])
            {
                wei+=1;
                i++;
            }else {
                di(nums);
                i=0;
            }
        }
        di(nums);
        return sum;
    }
    public static void di(int[] nums)
    {
        for(int j=0;j<wei;j++)
        {
            nums[j]=nums[j]-1;
            sum+=1;
        }
        wei=1;
    }
}
