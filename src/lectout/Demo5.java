package lectout;
/*
 盛水最多的容器
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        String s=new String("11");
        String s1=new String("11");
        System.out.println(s.equals(s1));
        System.out.println(finMax(nums));
    }

    public static int finMax(int[] num)
    {
        int temo=0;
        //采用两个索引
        int left=0,right=num.length-1;
        while (left<right)
        {
            //看左边和右边索引对应的值谁的小，因为长方形的面积是由最小的高决定的
            int h = Math.min(num[left], num[right]);
            //每次只留下最大的哪个长方形
            temo=Math.max(temo,h*(right-left));
            if(num[left]<num[right])
            {
                left++;
            }else {
                right--;
            }
        }
        return temo;
    }
}
