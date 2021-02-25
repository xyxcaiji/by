package 七牛云;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] nums = line.split(" ");
        int[][] n=new int[Integer.parseInt(nums[1])][2];
        for(int i=0;i<Integer.parseInt(nums[1]);i++)
        {
            String s=scanner.nextLine();
            String[] s1 = s.split(" ");
            n[i][0]=Integer.parseInt(s1[0]);
            n[i][1]=Integer.parseInt(s1[1]);
        }
        scanner.close();
        Arrays.sort(n,(e1,e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i][0]+" "+n[i][1]);
        }
        judge(Integer.parseInt(nums[0]),n);
    }
    public static void judge(int n,int[][] nums)
    {
        int min=1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i][0]==min)
            {
                max=Math.max(nums[i][1],max);
                if(nums[i][0]==min&&nums[i][1]==min+1)
                {
                    min++;
                }
            }
        }
        System.out.println(min+"...");
        if(max==n)
        {
            System.out.println("YES");
        }
        else if(min==n)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
