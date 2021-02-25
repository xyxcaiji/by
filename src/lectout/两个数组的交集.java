package lectout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class 两个数组的交集 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int n1:nums1)
        {
            list1.add(n1);
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(list1.contains(nums2[i]))
            {
                list2.add(nums2[i]);
                //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
                //Integer.valueOf(nums2[i]) 如果不将引用类型写进去，那他删除的是索引，不是值
                list1.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] num=new int[list2.size()];
        for(int j=0;j<num.length;j++)
        {
            num[j]=list2.get(j);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={8,4,9,8,4};
        System.out.println(Arrays.toString(intersect(num1,num2)));
    }
}
