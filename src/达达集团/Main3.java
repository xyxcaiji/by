package 达达集团;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String[] s=new String[m];
        for(int i=0;i<m;i++)
        {
            s[i]=scanner.nextLine();
        }
        String[] split = scanner.nextLine().split(",");
        //System.out.println(Arrays.toString(s));
        scanner.close();
        int[][] nums=new int[m][2];
        for(int i=0;i<m;i++)
        {
            String spli = s[i];
            String[] split1 = spli.split(",");
            nums[i][0]=Integer.parseInt(split1[0]);
            nums[i][1]=Integer.parseInt(split1[1]);
        }
        int start=0;
        int end=0;
        start=Integer.parseInt(split[0]);
        end=Integer.parseInt(split[1]);
        judge(nums,end,start,n);
    }
    public static void judge(int[][] nums,int end,int start,int n)
    {
        if(n==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i][0]>=start&&nums[i][1]<=end)
                {
                    System.out.println(nums[i][0]+","+nums[i][1]);
                }
            }
        }else if(n==2)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i][0]>end||nums[i][1]<start)
                {
                    continue;
                }
                System.out.println(nums[i][0]+","+nums[i][1]);
            }
        }
    }

}
