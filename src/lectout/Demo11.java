package lectout;
/*
 最长上升子序列
 */
public class Demo11 {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};

        System.out.println(findMax(nums));
    }
    public static int findMax(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        int[] di=new int[nums.length];
        di[0]=1;
        int max=di[0];
        for(int i=1;i<nums.length;i++)
        {
            //将每一个元素堪称单独的有序
            di[i]=1;
            for(int j=0;j<i;j++)
            {
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
