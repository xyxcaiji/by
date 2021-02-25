package main.去哪儿;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] c1=new String[n];
        String[] c2=new String[n];
        for(int i=0;i<n;i++){
            c1[i]=scanner.next();
        }
        for(int i=0;i<n;i++){
            c2[i]=scanner.next();
        }
        System.out.println(findMax(c1,c2));
    }
    public static int findMax(String[] c1,String[] c2){
        int[][] dp=new int[c1.length+1][c2.length+1];
        for(int i=0;i<c1.length+1;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<c2.length+1;j++){
            dp[j][0]=0;
        }
        for(int i=1;i<=c1.length;i++){
            for(int j=1;j<=c2.length;j++){
                if(c1[i-1].equals(c2[j-1])){
                    dp[i][j]=dp[i-1][j-1]+1;

                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[c1.length][c2.length];
    }
}
