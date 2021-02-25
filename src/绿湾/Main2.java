package 绿湾;

public class Main2 {
    public static void main(String[] args) {
        int[] nums={1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int temp=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(temp+nums[i]<0){
                temp=0;
            }else {
                temp+=nums[i];
            }
            max=Math.max(temp,max);
        }
        return max;
    }
}
