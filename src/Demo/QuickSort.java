package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
快排
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,6};
        quick(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quick(int[] nums,int l,int r)
    {
        if(l>=r)
        {
            return ;
        }
        int left=l,right=r;
        int base=nums[left];
        while (left<right)
        {
            if(left<right&&nums[right]>base)
            {
                right--;
            }
            if(left<right)
            {
                nums[left]=nums[right];
            }
            if(left<right&&nums[left]<base)
            {
                left++;
            }
            if(left<right)
            {
                nums[right]=nums[left];
            }
            if(left>=right)
            {
                nums[left]=base;
            }
        }
        quick(nums,l,left);
        quick(nums,left+1,r);
    }
}
