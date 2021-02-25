package lectout;

import java.util.HashMap;

/*
两数之和
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        he(nums,7);
    }
    public static void he(int[] nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp)&&map.get(temp)!=i)
            {
                System.out.println(target+"="+temp+"+"+nums[i]);
            }
        }
    }
}
