package 练习;

import java.util.Arrays;
import java.util.Scanner;

public class AOE {
    static int he=0;
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == "11");
    }


    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        int[][] nums=new int[n][2];
//        for(int i=0;i<n;i++)
//        {
//            nums[i][0]=scanner.nextInt();
//            nums[i][1]=scanner.nextInt();
//        }
//        scanner.close();
//        System.out.println(answer(nums,m));
//    }
    public static int answer(int[][] nums,int value)
    {
        int target=0;
        Arrays.sort(nums,(e1, e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);

        for(int i=0;i<nums.length;)
        {
            System.out.println("i="+i);
            int judge = judge(nums, value, i);
            System.out.println(he);
            i=judge;
            target+=he;
            he=0;
        }
       return target;
    }
    public static int judge(int[][] nums,int value,int i)
    {
        int temp=i;
        for(;i<nums.length;i++)
        {
            if(Math.abs(nums[temp][0]-nums[i][0])<=2*value)
            {
                he= Math.max(nums[temp][1],nums[i][1]);
            }else {
                return i;
            }
        }
        return i;
    }
}
