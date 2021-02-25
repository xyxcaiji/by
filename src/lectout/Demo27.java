package lectout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 三树之和==0
 */
public class Demo27 {
    public static void main(String[] args) {
        int[] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(findCount(nums));
    }
    public static List<List<Integer>> findCount(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            //通过一些 条件去掉一些重复的
            if(i==0||(i>0&&nums[i]!=nums[i-1]))
            {
                int l=i+1,r=nums.length-1,sums=0-nums[i];
                while (l<r)
                {
                    //三个条件
                    //如果相同 如果小于  如果大于
                    if(nums[l]+nums[r]==sums)
                    {
                        lists.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        r--;
                        l++;
                    }else if(nums[l]+nums[r]<sums)
                    {
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        l++;
                    }else{
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        r--;
                    }
                }
            }
        }
        return lists;
    }
}
