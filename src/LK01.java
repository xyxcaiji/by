import javax.crypto.MacSpi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LK01 {
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int[] ints = find2(nums, 9);
        System.out.println(Arrays.toString(ints));
    }
    public static void find(int []nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(temp==nums[j])
                {
                    System.out.println(target+"==》"+nums[i]+"+"+temp);
                }
            }
        }
    }

    public static int[] find2(int[] nums,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp)&&map.get(temp)!=i)
            {
                return new int[]{i,map.get(temp)};
            }
        }
        return new int[]{};
    }
}
