package lectout;
/*
一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/the-masseuse-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
输入： [1,2,3,1]
输出： 4
解释： 选择 1 号预约和 3 号预约，总时长 = 1 + 3 = 4。
198 213 337
 */
public class Demo29 {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(mesage(nums));
    }
    public static int mesage(int[] nums)
    {
        int a=0;//次优结果
        int b=0;//第二次的结果
        for(int i=0;i<nums.length;i++)
        {
            int c=Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}
