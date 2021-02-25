package alibaba;

import java.util.Scanner;

public class Main2 {
    static int sum;
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
        int[] dp=new int[n];
    return 1;
    }
}
