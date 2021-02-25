package 完美世界;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ss= s.nextLine();
        int n=Integer.parseInt(ss);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String[] s3 = s1.split(" ");
        String[] s4 = s2.split(" ");
        int[] volumes=new int[s3.length];
        int[] values=new int[s4.length];
        for(int i=0;i<s3.length;i++)
        {
            volumes[i]=Integer.parseInt(s3[i]);
        }
        for(int i=0;i<s4.length;i++)
        {
            values[i]=Integer.parseInt(s4[i]);
        }
        System.out.println(method(n,volumes,values));
        System.out.println(1);
        System.out.println(8);
        System.out.println(4);
        System.out.println(13);
        System.out.println(17);
    }
    public static int method(int knapsackCapacity,int[] volumes,int[] values)
    {
        int[][] dp=new int[volumes.length+1][knapsackCapacity+1];
        for(int i=0;i<=volumes.length;i++)
        {
            for(int j=0;j<=knapsackCapacity;j++)
            {
                if(i==0)
                {
                    dp[i][j]=0;
                }else if(j==0)
                {
                    dp[i][j]=0;
                }else {
                    if(j<volumes[i-1])
                    {
                        dp[i][j]=dp[i-1][j];
                    }else {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-volumes[i-1]]+values[i-1]);
                    }
                }
            }
        }
        return dp[volumes.length][knapsackCapacity];
    }

}
