package kaoshi;

import java.util.Scanner;
/*
路由器切换
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] weight=new int[n];
        int[] value=new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i]=scanner.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            value[j]=scanner.nextInt();
        }
        int i = maxValue(n, m, weight, value);
        System.out.println(i);
    }
    public static int maxValue(int n,int m,int[] weight,int[] value)
    {
        int[][] maxValue=new int[value.length+1][m+1];

        for(int i=0;i<=weight.length;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                {
                    maxValue[i][j]=0;
                }else{
                    if(j<weight[i-1])
                    {
                        maxValue[i][j]=maxValue[i-1][j];
                    }
                    else {
                        maxValue[i][j]=Math.max(maxValue[i-1][j],maxValue[i-1][j-weight[i-1]]+value[i-1]);

                    }
                }
            }
        }
        return maxValue[n][m];
    }
}
