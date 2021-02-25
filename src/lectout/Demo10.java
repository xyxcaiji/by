package lectout;

import java.util.Arrays;

/*
零钱兑换

给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/coin-change
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
输入: coins = [1, 2, 5], amount = 11
输出: 3
解释: 11 = 5 + 5 + 1
 */
public class Demo10 {
    public static void main(String[] args) {
     int[] nums={1,2,5};
        System.out.println(find(nums,11));
    }
    public static int find(int[] nums,int amount)
    {
        if(amount==0)
        {
            return -1;
        }
        //di[j] 代表当面额为j的时候di[j]对应是最小的值
        int[] di=new int[amount+1];
        Arrays.fill(di,1,di.length,Integer.MAX_VALUE);
        for(int con:nums)
        {
            for(int j=con;j<=amount;j++)
            {
                if(di[j-con]!=Integer.MAX_VALUE)
                {
                    //到第二次循环的时候
                    di[j]=Math.min(di[j],di[j-con]+1);
                }
            }
        }
        if(di[amount]!=Integer.MAX_VALUE)
        return di[amount];
        return -1;
    }
}
