package lectout;
/**
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */

import java.util.Arrays;

public class 数字转为字符串 {
    public static void main(String[] args) {
        System.out.println(transNum(1));
    }
    public static int transNum(int num)
    {
        String s = num+"";
        int[] dp=new int[s.length()+2];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            char c = s.charAt(i-2);
            if((i+1<dp.length)&&(c=='1'||(c=='2'&&s.charAt(i-1)<='5')))
            {
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length-1];
    }
}
