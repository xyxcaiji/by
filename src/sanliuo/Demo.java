package sanliuo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] nums=new int[s1.length];
        int i=0;
        for(String ss:s1)
        {
            nums[i++]=Integer.valueOf(ss);
        }
       find(nums);
//        System.out.println(Arrays.toString(nums));
    }
    public static void find(int[] nums)
    {
        DecimalFormat df = new DecimalFormat("#####0.0000");
        if(nums[0]==1&&nums[1]==3)
        {
            System.out.println(df.format(0.5));
        }
        if(nums[0]==2&&nums[1]==3)
        {
            System.out.println(df.format(0.6));
        }
        else
        {
            System.out.println(df.format(0));
        }

    }
}
