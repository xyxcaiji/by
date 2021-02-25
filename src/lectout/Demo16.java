package lectout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Demo16{
    public static void main(String[] args) {
        int [] nums={1,1,3};
//        List<Integer> lists = ;
        System.out.println(backTrack(nums));
        //System.out.println(Math.multiplyExact(2,3));
    }

    public static ArrayList<ArrayList<Integer>>  backTrack(int[] nums)
    {
        //全局变量集合  存储所有的集合
        int temp=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) temp++;
        }
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        int[] user=new int[nums.length];
        test(lists,new ArrayList<>(),nums,user);

        return lists;
    }
    public static void test(List<ArrayList<Integer>> lists, List<Integer> templist, int[] nums, int[] used)
    {
        if(templist.size()==nums.length)
        {
            lists.add(new ArrayList(templist));
        }else{
            for(int i=0;i<nums.length;i++)
            {
                //去重用的
                //我写了一下递归就是这个 在碰到最初的第一次循环时从i=0到i=1的时候 他会跳过i=1，去循环i=2 可能就是去重用的
                //如果碰到相同的字符 就跳过他
                if(used[i]==1 || (i>0&&used[i-1]==0 && nums[i-1]==nums[i])) continue;
                used[i]=1;
                templist.add(nums[i]);
                test(lists,templist,nums,used);
                //System.out.println(templist);
                templist.remove(templist.size()-1);
                used[i]=0;
            }
        }
    }


}