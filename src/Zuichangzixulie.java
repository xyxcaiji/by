import java.util.HashMap;

public class Zuichangzixulie {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 7, 101, 18};
       HashMap hashMap=new HashMap(20);
        System.out.println(hashMap.size());
        System.out.println(lengthOfLIS(nums));
    }

    //就是将a[1]与a[0]比，如果a1>a0,那么就给db[i]+1,每一次循环让db[i]与上一次的db[i]比较，谁大谁就是最长升序子序列
    public static int lengthOfLIS(int[] nums) {
        int[] db = new int[nums.length];
        db[0] = 1;
        int maax = db[0];
        for (int i = 1; i < nums.length; i++) {
            db[i] = 1;
            for (int j = 0; j < i; j++) {
                //我真不明白加db[j]+1>db[i]有啥用
                if (nums[i] > nums[j] && db[j] + 1 > db[i]) {
                    db[i] = db[j] + 1;
                }
            }
            if (maax < db[i]) {
                maax = db[i];
            }
        }
        return maax;
    }
}