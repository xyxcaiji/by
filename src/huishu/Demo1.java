package huishu;

import java.util.ArrayList;
import java.util.List;
/*
回溯法
 */
/*
给你一组数
输出所有的排序可能
 */
public class Demo1 {
    public static void main(String[] args) {
        int [] nums={1,1,3};
        List<List<Integer>> lists = backTrack(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>>  backTrack(int[] nums)
    {
        int[] dp=new int[nums.length];
        //全局变量集合  存储所有的集合
        List<List<Integer>> lists=new ArrayList<>();
        test(lists,new ArrayList<>(),nums,dp);
        return lists;
    }
    public static void test(List<List<Integer>> lists,List<Integer> templist,int[] nums,int dp[])
    {
     if(templist.size()==nums.length)
     {
         //当满足条件时，将得到的集合存到全局变量中
         lists.add(new ArrayList<>(templist));
     }else{
         for(int i=0;i<nums.length;i++)
         {
             //如果临时数组中包含这个值，那么跳过
             //if(templist.contains(nums[i])) continue;
             if(dp[i]==1) continue;
             //否则就加进去
             templist.add(nums[i]);
             dp[i]=1;
             //然后递归循环下一个改进去的数值时谁，顺便加进去
             test(lists,templist,nums,dp);
             dp[i]=0;
             //输出看一下加进去的值是多少，在看看 i为什么时递归结束l
             System.out.println("templist里面的数值为"+templist+"___"+i);
             //最后一步，也是最重要的一步
             //remove掉templist中的最后一个数值，这样才 能回溯
             templist.remove(templist.size()-1);
         }
     }
    }

}
