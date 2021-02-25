package Demo;
/*
最长上升子序列
用到了动态规划的思想
 */
public class Lis {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18,19,100};
        int max = lis(nums);
        System.out.println(max);
    }
    public static int lis(int[] nums)
    {
        int[] di=new int[nums.length];
        di[0]=1;
        int max=di[0];

        for(int i=1;i<nums.length;i++)
        {
            di[i]=1;
            for(int j=0;j<i;j++)
            {
                //di[j]+1>di[i]
                //这个判断条件其实就是 如果nums[i]大于nums[j] 那么就证明nums[j]nums[i]是升序的，所以就给nums[i]对应的d[i]+1；表示他最长的升序子序列为多少
                if(nums[i]>nums[j]&&di[j]+1>di[i])
                {
                    di[i]=di[j]+1;
                }
                if(max<di[i])
                {
                    max=di[i];
                }
            }
        }
        return max;
    }
}
