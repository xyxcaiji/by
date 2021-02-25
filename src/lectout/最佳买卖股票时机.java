package lectout;

/**
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 *
 * 此题展现出来的维度有三个。思路是先降维，将买、卖、冷冻，降维成两个维度：
 * 持有股票和未持有股票。 持有股票：今天买入和之前买入但未卖出 未持有：
 * 今天卖出和冷冻期 所以有的传递式： hold[i]=max(hold[i-1],notHold[i-2]-prices[i]);
 * 意思是当前持有的股票的最大收益是昨天持有的股票（可能今天并未有任何操作）和之前卖出的最大
 * 收益-今天买入的(i-2的意思是今天买入的话，昨天就应该是冷冻期)。
 * notHold[i]=max(notHold[i-1],hold[i-1]+prices[i]);最大收益的就很容易理解。
 */
public class 最佳买卖股票时机 {
    public static void main(String[] args) {
        int[] prives={1,2,3,0,2};
        System.out.println(maxProfit(prives));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length<1)
            return 0;
        int n=prices.length;
        //hold持有的最大钱数
        int[] hold=new int[n];
        //刚刚开始买入，所以是负数
        hold[0]=-prices[0];
        //最大收益
        int[] nohold=new int[n];
        for(int i=1;i<n;i++)
        {
            if(i>=2) hold[i]=Math.max(hold[i-1],nohold[i-2]-prices[i]);
            else hold[i]=Math.max(hold[i-1],-prices[i]);
            nohold[i]=Math.max(nohold[i-1],hold[i-1]+prices[i]);
        }
        return nohold[n-1];
    }
}
