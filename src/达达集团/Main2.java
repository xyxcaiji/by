package 达达集团;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        String[] s=new String[m];
        for(int i=0;i<m;i++)
        {
            s[i]=scanner.nextLine();
        }
        scanner.close();
        int[][] nums=new int[m][2];
        for(int i=0;i<m;i++)
        {
            String spli = s[i];
            String[] split1 = spli.split(",");
            nums[i][0]=Integer.parseInt(split1[0]);
            nums[i][1]=Integer.parseInt(split1[1]);
        }
        shu(nums);

    }
    public static void shu(int[][] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i][1]*=2500;
        }
        for(int i=0;i<nums.length;i++)
        {
            while (nums[i][1]!=0)
            {
                nums[i][1]--;
                System.out.println(nums[i][0]);
            }
            if(i==nums.length)
            {
                i=0;
            }
        }
    }
}
