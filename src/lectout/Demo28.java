package lectout;

import java.util.Arrays;

/*
安排人手问题
输入：[[10,20],[30,200],[400,50],[30,20]]
输出：110
解释：
第一个人去 A 市，费用为 10。
第二个人去 A 市，费用为 30。
第三个人去 B 市，费用为 50。
第四个人去 B 市，费用为 20。

最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-city-scheduling
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo28 {
    public static void main(String[] args) {
        int[][] nums={{10,20},{30,200},{400,50},{30,20}};
        System.out.println(find(nums));
    }
    public static int find(int[][] nums)
    {
        int sumA=0;
        int[] cos=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            //所有人都去a的总钱数
            sumA+=nums[i][0];
            //去b与a差值的
            cos[i]=nums[i][1]-nums[i][0];
        }
        Arrays.sort(cos);
        //减去差值为前一半的的数量，就是最少钱数
        for(int i=0;i<cos.length/2;i++)
        {
            sumA+=cos[i];
        }
        return sumA;
    }
}
