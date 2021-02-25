package lectout;
/*
 小偷偷钱
 */
public class Demo30 {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(find(nums));
    }
    public static int find(int[] nums)
    {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int[] dp=new int[nums.length+1];
        dp[1]=nums[0];
        for(int i=2;i<=nums.length;i++)
        {
            //他的上一个 与上上一个+本次的nums【i-1】
            //第三个 肯定是 第二个 与 第一个加上第三个进行比较 谁打选谁
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
}
