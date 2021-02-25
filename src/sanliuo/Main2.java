package sanliuo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        double res = get(n, m);
        System.out.println(String.format("%.4f", res));
    }

    private static double get(int n, int m) {
        double[][] nums = new double[n + 1][m + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = 1.0;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[0].length; j++) {
                nums[i][j] = nums[i][j] + (double) i / (i + j);
                double jm = (double) j;
                double in = (double) i;
                if(j > 1){
                    nums[i][j] = nums[i][j] + (jm / (in + jm)) * ((jm - 1) / (in + jm - 1)) * (in / (in + jm - 2)) * nums[i - 1][j - 2];
                }
                if(j > 2){
                    nums[i][j] = nums[i][j] + (jm / (in + jm)) * ((jm - 1) / (in + jm - 1)) * (jm - 2) / (in + jm - 2) * nums[i][j - 3];
                }
            }
        }
        return nums[n][m];
    }
}