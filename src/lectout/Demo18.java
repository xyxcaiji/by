package lectout;

import java.util.Set;

/*
跳跃问题
输入: [2,3,1,1,4]
输出: 2
解释: 跳到最后一个位置的最小跳跃数是 2。
     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/jump-game-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo18 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums)
    {
        if(nums.length==1) return 0;
        int step=0;
        int nextreach=nums[0];
        int reach=0;
        for(int i=0;i<nums.length;i++)
        {
            //下一次要跳的步数（其实就是上一跳的距离加厚后面下一跳的距离 ，你品，你洗洗的品）
            nextreach=Math.max(nums[i]+i,nextreach);
            if(nextreach>=nums.length-1)  return step+1;
            //如果这次要跳的格数==i下标
            //证明跳到了
            if(i==reach)
            {
                //步数+1
                step++;
                //让跳数==下一跳
                reach=nextreach;
            }
        }
        return step;
    }
}
