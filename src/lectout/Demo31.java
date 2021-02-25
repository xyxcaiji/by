package lectout;
/*

 小偷偷钱2
 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/house-robber-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 输入: [2,3,2]
输出: 3
解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 */
public class Demo31 {
    public static void main(String[] args) {
        int[] nums={2,3,2};
        System.out.println(findMain(nums));
    }
    public static int findMain(int[] nums)
    {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        dp1[1]=nums[0];
        dp2[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i-1]);
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        return Math.max(dp1[nums.length-1],dp2[nums.length-1]);
    }
}
