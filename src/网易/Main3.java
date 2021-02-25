package 网易;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        int[] answers=new int[t];
        int j=0;
        while (t>0)
        {
            int n=scanner.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scanner.nextInt();
            }
            answers[j++]=find(nums);
            //System.out.println(find(nums));
            t--;
        }
        for(int i=0;i<answers.length;i++)
        {
            System.out.println(answers[i]);
        }
    }
    public static int find(int[] nums)
    {
        Arrays.sort(nums);
        int n1=nums[0];
        int n2=0;
        int j=nums.length-1;
        int i=1;
        while (i<=j)
        {
            if(n1>=n2)
            {
                n2+=nums[j];
                j--;
            }else if(n1<n2) {
                n1+=nums[i];
                i++;
            }
        }
//        System.out.println(n1);
//        System.out.println(n2);
        return n1>n2?(n1-n2):(n2-n1);
    }
}
