package lectout;
/**
 * 力扣42
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */

import java.awt.font.NumericShaper;

public class 接水滴 {
    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(tran(nums));

        //System.out.println(b+++5*++b);
    }
    public static int tran(int[] nums)
    {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        int res = 0;
        for(int i=1;i<nums.length;i++)
        {
            int leftMax=0,rightMax=0;
            for(int j=0;j<=i;j++)
            {
                leftMax=Math.max(nums[j],leftMax);
            }
            for(int r=i;r<nums.length;r++)
            {
                rightMax=Math.max(nums[r],rightMax);
            }
            res+=Math.min(leftMax,rightMax)-nums[i];
        }
        return res;
    }
}
