package tuya;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //int[] nums={-1,-2,-3};//0
        //{-2,-5,0,4,-7}; 10
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();//数组大小
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        scanner.close();
        sum(nums);
    }
    public static void sum(int[] nums)
    {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int[] temp = Arrays.copyOfRange(nums, i, nums.length);
            max= Math.max(max,count(temp));
        }
        System.out.println(max);
    }
    public static int count(int[] temp)
    {
        int max=0;
        for(int i=0;i<temp.length;i++)
        {
            max+=(temp[i]*(i+1));
        }
        //System.out.println(Arrays.toString(temp)+"    "+max);
        return max;
    }
}
