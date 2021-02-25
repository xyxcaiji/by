package 京东;
/**
 * 2
 * 1345 2584
 * 2584 683
 * 2584 1345
 * 683 1345
 * 683 1345
 * 2584 683
 * 1234 4567
 * 1234 4567
 * 4567 4321
 * 4322 4567
 * 4321 1234
 * 4321 1234
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[6*n][2];
        for(int j=0;j<nums.length;j++)
        {
            for(int i=0;i<2;i++)
            {
                nums[j][i]=scanner.nextInt();
            }
        }
        if(nums.length==0||nums==null)
        {
            System.out.println("IMPOSSIBLE");
        }
        int[] xiang = new int[12];
        int temp=0;
        int m=0;
        for(int j=0;j<nums.length;j++)
        {
            temp+=1;
            for(int i=0;i<2;i++)
            {
                xiang[m++]=nums[j][i];
            }
            if(temp%6==0)
            {
                 if(judge(xiang)==true)
                 {
                     System.out.println("POSSIBLE");
                 }else {
                     System.out.println("IMPOSSIBLE");
                 }
                 m=0;
            }
        }
    }
    public static boolean judge(int[] nums)
    {
        boolean jud = true;
        int[] n = new int[3];
        int n1=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=4)
        {
            if(nums[i]==nums[i+1]&&nums[i+2]==nums[i+1]&&nums[i+2]==nums[i+3])
            {
                n[n1++]=1;
            }
        }
        for(int j=0;j<n.length;j++)
        {
            if(n[j]!=1) jud=false;

        }
        return jud;
    }
}
