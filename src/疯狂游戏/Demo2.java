package 疯狂游戏;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(",");
        int[][] nums=new int[split.length][split[0].length()];
        for(int i=0;i<split.length;i++){
            for(int j=0;j<split[i].length();j++)
            {
                nums[i][j]=Integer.parseInt(Character.toString(split[i].charAt(j)));
            }
        }
        System.out.println(findNumber(nums));
    }
    public static int findNumber(int[][] nums)
    {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(nums[i][j]==1)
                {
                    int numbmer=finMax(nums,i,j);
                    if(numbmer!=0)
                    {
                        result++;
                    }
                }
            }
        }
        return result;
    }
    public static int finMax(int[][] nums,int i,int j)
    {
        if(i<0||j<0||i>=nums.length||j>=nums[0].length||nums[i][j]!=1)
        {
            return 0;
        }
        nums[i][j]=0;
        return 1+finMax(nums,i+1,j)+finMax(nums,i-1,j)+finMax(nums,i,j-1)+finMax(nums,i,j+1);
    }

}
