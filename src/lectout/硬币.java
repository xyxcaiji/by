package lectout;

import java.nio.file.Watchable;

/**
 * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，
 * 编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 *
 *  输入: n = 5
 *  输出：2
 *  解释: 有两种方式可以凑成总金额:
 * 5=5
 * 5=1+1+1+1+1
 */
public class 硬币 {
    public static void main(String[] args) {
        int[] values={25,10,5,1};
        System.out.println(waysToChange(10,values));
    }
    public static int waysToChange(int n,int[] values) {
        int[] dp=new int[n+1];
        for(int i=0;i<values.length;i++)
        {
            for(int j=1;j<dp.length;j++)
            {
                if(values[i]==j) dp[j]=(dp[j]+1);
                else if(values[i]<j)
                {
                    dp[j]=dp[j]+dp[j-values[i]];
                }
            }
        }
        return dp[n];
    }
}
