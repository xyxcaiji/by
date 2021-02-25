package meituan;

import thread.马士兵.c_001.T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] strs=new int[m][2];
        for(int i=0;i<m;i++)
        {
            strs[i][0]=scanner.nextInt();
            strs[i][1]=scanner.nextInt();
        }
        scanner.close();
        heBing(strs,n,m);
    }
    public static void heBing(int[][] nums,int n,int m)
    {
        ArrayList<Integer> lists=new ArrayList<>();
        ArrayList<Integer> answer=new ArrayList<>();
        lists.add(nums[0][0]);
        lists.add(nums[0][1]);
        int[] dp=new int[m];
        dp[0]=1;
        int temo=0;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<m;j++)
            {

                if(dp[j]==0)
                {
                    if(lists==null)
                    {
                        lists.add(nums[j][1]);
                        lists.add(nums[j][0]);
                    }
                    if(lists.contains(nums[j][0])&&!lists.contains(nums[j][1]))
                    {
                        lists.add(nums[j][1]);
                        dp[j]=1;
                    }else if(lists.contains(nums[j][1])&&!lists.contains(nums[j][0]))
                    {
                        lists.add(nums[j][0]);
                        dp[j]=1;
                    }else if(lists.contains(nums[j][0])&&lists.contains(nums[j][1])) {
                        dp[j]=1;
                    }
                }
            }
            if(lists==null)
            {
                break;
            }
            int size=lists.size();
            Integer[] integers = lists.toArray(new Integer[size]);
            temo++;
            Arrays.sort(integers);
            for(int c=0;c<integers.length;c++)
            {
                answer.add(integers[c]);
            }
            answer.add(-999);
            lists=null;
        }

        int size=answer.size();
        Integer[] integers = answer.toArray(new Integer[size]);
        System.out.println(temo);
        for(int i=0;i<integers.length;i++)
        {
            if(integers[i]==-999)
            {
                System.out.println();
                continue;
            }
            System.out.print(integers[i]+" ");
        }
    }
}
