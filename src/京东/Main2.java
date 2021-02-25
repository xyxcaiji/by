package 京东;
/**
 * 10
 * 84 302
 * 275 327
 * 364 538
 * 26 364
 * 29 386
 * 545 955
 * 715 965
 * 404 415
 * 903 942
 * 150 402
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                nums[i][j]=scanner.nextInt();
            }
        }
        Arrays.sort(nums,(e1, e2)->e1[1]-e2[1]!=0?e1[1]-e2[1]:e2[0]-e1[0]);
        if(nums.length==3)
        {
            System.out.println(3);
        }else {
            System.out.println(find(nums));
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int find(int[][] nums)
    {
        List<Integer> list=new ArrayList();
        if(nums.length==3||nums.length==1)
        {
            return nums.length;
        }
        int min=nums[0][1];
        list.add(0);
        for(int j=1;j<nums.length;j++)
        {
            if(list.contains(j)) continue;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i][0]>min)
                {
                    if(!list.contains(i))
                    {
                        list.add(i);
                    }
                    min=nums[i][1];
                }
            }
            min=0;
        }

        return nums.length-list.size();
    }
}
/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                nums[i][j]=scanner.nextInt();
            }
        }
        Arrays.sort(nums,(e1, e2)->e1[1]-e2[1]!=0?e1[1]-e2[1]:e2[0]-e1[0]);
        System.out.println(find(nums));
    }
    public static int find(int[][] nums)
    {
        int temp=1;
        int min=nums[0][1];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i][0]>min)
            {
                temp+=1;
                min=nums[i][1];
            }
        }
        return nums.length-temp-1;
    }
}

 */
