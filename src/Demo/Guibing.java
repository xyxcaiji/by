package Demo;

import sun.nio.cs.ext.MS874;

import java.util.Arrays;

/*
归并排序
 */
public class Guibing {
    public static void main(String[] args) {
        int []arr={19,97,1,8,9,17,3,18,19,1,2,4,6,79,484,54,61,22,33,44,55,66,77,99,444,55,16,23};
        int[] ints = guiBing(arr);

        System.out.println(Arrays.toString(ints));
    }
    public static int[] guiBing(int[] nums)
    {
        nums= Arrays.copyOf(nums,nums.length);
        if(nums.length<2){
            return nums;
        }

        int middle= (int) Math.floor(nums.length/2);
        int[] left=Arrays.copyOfRange(nums,0,middle);
        int[] right=Arrays.copyOfRange(nums,middle,nums.length);

        return merage(guiBing(left),guiBing(right));
    }
    public static int[] merage(int[] left,int[] right)
    {
        int[] count=new int[left.length+right.length];
        int i=0;
        while (left.length>0&&right.length>0)
        {
            if(left[0]>right[0])
            {
                count[i++]=left[0];
                left=Arrays.copyOfRange(left,1,left.length);
            }else{
                count[i++]=right[0];
                right=Arrays.copyOfRange(right,1,right.length);
            }
        }
        while (left.length>0)
        {
            count[i++]=left[0];
            left=Arrays.copyOfRange(left,1,left.length);
        }
        while (right.length>0)
        {
            count[i++]=right[0];
            right=Arrays.copyOfRange(right,1,right.length);
        }
        return count;
    }
}
