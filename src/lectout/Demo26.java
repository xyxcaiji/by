package lectout;

import java.util.Arrays;

/*
输入：[3,2,1,2,1,7]
输出：6
解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo26 {
    public static void main(String[] args) {
        int[] nums={3,2,1,2,1,7};
        System.out.println(findStrp(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int findStrp(int[] nums)
    {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int remove=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int temp=nums[i];
                nums[i]=nums[i-1]+1;
                remove+=nums[i]-temp;
            }
        }
        return remove;
    }
}
