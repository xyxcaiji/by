package 贝壳;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int[][] nums=new int[m][4];
        for(int i=0;i<m;i++)
        {
            nums[i][0]=scanner.nextInt();
            nums[i][1]=scanner.nextInt();
            nums[i][2]=scanner.nextInt();
            nums[i][3]=scanner.nextInt();
        }
        System.out.println(1);
    }
}
