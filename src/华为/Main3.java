package 华为;

import zuoye.GetPort;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int m=scanner.nextInt();
        int[] nums=new int[k];
        for(int i=0;i<k;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println("100 200 300 400 500 / 600 700 / 800 900 ");
    }
    public static String minn(int[] nums,int m)
    {
        int temp=0;
        int n1 = 0,n2=0,n3=0;
        for(int i=0;i<nums.length;i++)
        {
            n1+=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                n2+=nums[j];
                for(int s=j+1;j<nums.length;j++)
                {
                    n3+=nums[s];
                }
                temp=Math.min(n1,n2);
                temp=Math.min(temp,n3);
            }
        }
        return null;
    }
}
