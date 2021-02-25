package tuya;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        int[] nums={ 1,-2, 2,1,-2,-5,2};
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(maxSum(nums));
    }
    public static int maxSum(int[] nums) {
        int tem1=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                tem1++;
                continue;
            }
            max+=nums[i];
        }
        if(tem1==nums.length) return 0;
        else if(tem1<=2||tem1==nums.length-1) return max;
        else {
            max=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<0)
                {
                    continue;
                }
                max=Math.max(findMax(j,nums),max);
            }
            return max;
        }
    }
    public static int findMax(int j,int[] nums)
    {
        int temp=0;
        int max=0;
        while (temp<=2&&j<nums.length)
        {
            if(nums[j]<0)
            {
                temp++;
                j++;
                continue;
            }else {
                max+=nums[j];
                j++;
            }
        }
        return max;
    }
}
