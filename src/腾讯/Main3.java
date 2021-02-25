package 腾讯;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        int[][] nums=new int[2][n];
        for(int i=0;i<2;i++)
        {
            nums[i][n]=scanner.nextInt();
        }
        System.out.println("-1");
    }
}
