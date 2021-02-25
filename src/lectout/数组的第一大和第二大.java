package lectout;

public class 数组的第一大和第二大 {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5,6,7,8 };
        int fmax=0;
        int smax=0;
        for(int num:nums){
            if(num>fmax){
                smax=fmax;
                fmax=num;
            }else if(num>smax){
                smax=num;
            }
        }
        System.out.println("第一大"+fmax+"  第二大"+smax);
    }
}
