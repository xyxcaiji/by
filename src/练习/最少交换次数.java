package 练习;
/**
 * * data: 3 6 1 4 2 5
 * * nums: 1 2 3 4 5 6
 * * 统计出counts = 1,返回结果n-counts : 6-1=5
 *
 *
 * 举个例子 现在有 3 6 1 4 2 5 这个序列 ，那么 6 是不用移动的。
 *
 * 我们先把 5移动到最前，此时变成 5 3 6 1 4 2
 *
 * 再把 4 移动到 最钱 就变成 4 5 3 6 1 2
 *
 * 接着移动 3 到最前就变成 3 4 5 6 1 2
 *
 * 移动2就变成 2 3 4 5 6 1，最后移动 1 变成我们需要的 1 2 3 4 5 6；共需移动5次，结果为5
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 最少交换次数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        //System.out.println(Arrays.toString(nums));
        System.out.println(minSwap(nums));
    }
    public static int minSwap(int[] nums) {
        int answer=0;
        int n=nums.length;
        int[] clone = nums.clone();
        Arrays.sort(clone);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(clone));
        for(int i=n-1,j=n-1;i>=0;i--)
        {
            if(nums[i]==clone[j]){
                answer++;
                j--;
            }
        }
        return n-answer;
    }

}
