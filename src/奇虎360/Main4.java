package 奇虎360;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++)
        {
            nums[i][1]=scanner.nextInt();
            nums[i][0]=scanner.nextInt();
        }
        System.out.println(find(nums,n));
    }
    public static int find(int[][] nums,int n)
    {
        Arrays.sort(nums,(e1, e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);
//        for(int i=0;i<nums.length;i++)
//        {
//            System.out.println(nums[i][0]+"=="+nums[i][1]);
//        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i][0]==0)
            {
                max+=nums[i][1];
            }
            if(nums[i][0]==1)
            {
                max=Math.max(max*2,max+nums[i][1]);
            }
        }
        return max;
    }
}
