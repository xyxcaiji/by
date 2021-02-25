package lectout;
/*
 移除元素
 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
给定 nums = [3,2,2,3], val = 3,

函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。

你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo9 {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        System.out.println(removeV(nums,3));
    }
    public static int removeV(int[] nums,int value)
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            //如果遍历到的数值不等于要删除的值，就讲值放进数组，如果碰见要删除的值，就跳不，不把他放进数组
            if(nums[i]!=value)
            {
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
