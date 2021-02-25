package lectout;

import java.util.ArrayList;
import java.util.List;

public class 最长公共子序列 {
    public static void main(String[] args) {
        String a = "12asdfa";
        String b = "we2rasdaswer";
        System.out.println(lcs(a,a.length(),b,b.length()));
        System.out.println(2<<1);
    }
    public static int lcs(String a,int n,String b,int m)
    {
        int[][] dp=new int[n+1][m+1];
        int i=0,j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
}
