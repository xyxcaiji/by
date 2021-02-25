package lectout;

import Demo.Lis;

import javax.xml.transform.Templates;
import java.util.ArrayList;
import java.util.List;

public class 全排列之分配房间 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        List<List<Integer>> fin = fin(nums);
        System.out.println(fin);
    }
    public static List<List<Integer>> fin(int[] nums)
    {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        test(lists,list,nums,-2);
        return lists;
    }
    public static void test(List<List<Integer>> lists,List<Integer> templist,int[] nums,int index)
    {
        if(templist.size()==nums.length)
        {
            lists.add(new ArrayList<>(templist));
            return;
        }else {
            for(int i=0;i<nums.length;i++)
            {
                if(!templist.contains(nums[i])&&nums[i]-1!=index&&nums[i]+1!=index)
                {
                    templist.add(nums[i]);
                    test(lists,templist,nums,nums[i]);
                    templist.remove(templist.size()-1);
                }
            }
        }
    }
}
