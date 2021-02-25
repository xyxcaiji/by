package lectout;

public class 打家劫舍 {
    public static void main(String[] args) {

        int[] nums={2,5,4,9};
        System.out.println(findMax(nums));
    }
    public static int findMax(int[] nums){
        int cha =0;
        int you = 0;
        for(int i=0;i<nums.length;i++){
            int c = Math.max(you,cha+nums[i]);
            cha=you;
            you=c;
        }
        return you;
    }
}
