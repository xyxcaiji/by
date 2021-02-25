package 网易;

import java.util.Scanner;

/**
 * 3 50
 * 100 50 51
 * 1000 1000 1000
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int pep=scanner.nextInt();
        int[][] nums=new int[2][n];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                nums[i][j]=scanner.nextInt();
            }
        }
//        for(int[] n1:nums)
//        {
//            for(int nn:n1)
//            {
//                System.out.print(nn);
//            }
//            System.out.println();
//        }
    }
    public static int findMin(int[][] nums)
    {
        return 0;
    }
}
