package lectout;

public class f分割数组的最大值 {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }
    public static int splitArray(int[] nums, int m) {
        long left=0,right=0;
        for(int i=0;i<nums.length;i++)
        {
            left=Math.max(left,nums[i]);
            right+=nums[i];
        }
        //二分法
        /**
         * 二分法区间 解决
         * 开始我们先分为一组，如果大于中位数，那我们就让分组数+1
         * 一轮循环后如果 need>m 那么说明我们分的组数太多了，需要缩小，那么肯定在中位数的右边，
         * 所以让 left=mid+1;
         * 否认 就在左边 让 right=mid;
         * 直到 left不小于right
         *
         */
        /**
         * 为什么永long
         *
         * 发现这么个问题，存在这么一个测试用例，
         * [1,2147483647]
         * 2
         * 如果我们跟上面一样使用 int 的话，那么会溢出，虽然最终结果是一样的，
         * 但是逻辑上是由于
         * left = 2147483647, right = -2147483648,
         * left < right 不进入 while，直接返回的 left 最大值，逻辑不对劲，因此建议改成 long
         */
        while (left<right)
        {
            //表示不带符号 右移 1位
            long mid=(left+right)>>>1;
            int sum=0;
            int need=1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    sum=0;
                    ++need;
                }
                sum+=num;
            }
            System.out.println("left:"+left+"  right:"+right+"   mid"+mid);
            if(need>m) left=mid+1;
            else right=mid;
           // System.out.println("left:"+left+"  right:"+right+"   mid"+mid);

        }
        return (int) left;
    }
}
