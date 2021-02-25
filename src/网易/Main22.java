package 网易;

import java.util.Arrays;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m = scanner.nextInt();
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(find(nums,m)));
    }
    public static int[] find(int[] nums,int m)
    {
        return nums;
    }
}
