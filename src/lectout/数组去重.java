package lectout;

public class 数组去重 {
    public static void main(String[] args) {
        int[] temp={1,1,1,2,2,3};
        System.out.println(removeDuplicates(temp));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null) return 0;
        int j=0,i=0;
        while (j<nums.length)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }else {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
