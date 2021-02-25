package 吉比特;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long z = scanner.nextLong();
        long n = scanner.nextLong();
        int[][] nums=new int[3][2];
        for(int i=0;i<3;i++)
        {
            nums[i][0]=scanner.nextInt();
            nums[i][1]=scanner.nextInt();
        }

        while (n>0)
        {
            long x1=x;
            long y1=y;
            long z1=z;
            y+=nums[0][0]*x1+nums[2][1]*z1;
            x+=nums[1][0]*y1+nums[2][0]*z1;
            z+=nums[0][1]*x1+nums[1][1]*y1;
            n--;
        }
        System.out.println(x%1000000007+" "+y%1000000007+" "+z%1000000007);
        //System.out.println(3+" "+3+" "+3);
    }
}
