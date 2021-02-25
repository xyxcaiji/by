package 练习;

public class MAXmin {
    static int max;
    static int min;
    public static void main(String[] args) {
        int[] nums={3,1,5,2,66,213,12,234};
        paiXu(nums);
        System.out.println(min+":::"+max);
    }
    public static void paiXu(int[] nums)
    {
        max=min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }else if(nums[i]>max)
            {
                max=nums[i];
            }
        }
    }
}
