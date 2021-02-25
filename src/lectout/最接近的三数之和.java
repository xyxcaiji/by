package lectout;

import java.util.Arrays;

/**
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 */
public class 最接近的三数之和 {
    public static void main(String[] args) {

    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums==null||nums.length==0) return 0;
        int minNum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int l=i+1,r=nums.length-1;
            while (l<r)
            {
                int treeNum=nums[i]+nums[l]+nums[r];
                if(Math.abs(minNum-target)>Math.abs(treeNum-target))
                {
                    minNum=treeNum;
                }
                if(treeNum<target)
                {
                    l++;
                }
                else if(treeNum>target)
                {
                    r--;
                }
                else {
                    return target;
                }
            }

        }
        return minNum;
    }
}
