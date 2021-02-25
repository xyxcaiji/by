package lectout;

import Demo.Lis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
组合总和
给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的
数字可以无限制重复被选取。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combination-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

回溯算法：和之前写过的全排列是一样的
类似的还可以求：
组合总和
全排列
子集
 */
public class Demo13 {
    public static void main(String[] args) {
        int[] nums={1,1,2};

        System.out.println(count1(nums,8));
    }
    public static List<List<Integer>> count1(int[] nums,int target)
    {
        List<List<Integer>> lists=new ArrayList<>();
        find(lists,new ArrayList<>(),nums,target,0);
        return lists;
    }
    public static void find(List<List<Integer>> lists,List<Integer> temp,int[] nums,int target,int start)
    {
        if(target==0)
        {
            lists.add(new ArrayList<>(temp));
        }
        for(int i=start;i<nums.length;i++)
        {
            if(nums[i]>target)
            {
                continue;
            }
            temp.add(nums[i]);
            find(lists,temp,nums,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
//class Solution {
//    List<List<Integer>> res;
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        backTrack(list, 0, list.size());
//        return res;
//    }
//
//    public void backTrack(List<Integer> list, int start, int length) {
//        if (start == length) res.add(new ArrayList(list));
//
//        for (int i = start; i < length; i++) {
//            boolean flag = true;
//            for (int j = start; j < i; j++) {
//                if (list.get(i).equals(list.get(j)) && i != start) flag = false;
//            }
//            if (flag) {
//                Collections.swap(list, start, i);
//                backTrack(list, start + 1, length);
//                Collections.swap(list, start, i);
//            }
//        }
//    }
//}