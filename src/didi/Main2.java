package didi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        she(n);
    }
    public static void she(int n)
    {
        int num=n*n;
        Stack<Long> stack=new Stack<>();
        for(int i=1;i<=num;i++)
        {
            stack.push(fei(i));
        }
        long[][] nums=new long[n][n];
        int i=0,j=0;
        for(int k=0;k<n/2;k++)
        {
            for(i=k,j=k;j<n-k-1;j++)
            {
                nums[i][j]=stack.pop();
            }
            for(i=k,j=n-k-1;i<n-k-1;i++)
            {
                nums[i][j]=stack.pop();
            }
            for(i=n-k-1,j=n-k-1;j>k;j--)
            {
                nums[i][j]=stack.pop();
            }
            for(i=n-k-1,j=k;i>k;i--)
            {
                nums[i][j]=stack.pop();
            }
        }
        if(n%2==1){
            nums[n/2][n/2]=stack.pop();
        }
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<n;b++)
            {
                System.out.print(nums[a][b]+" ");
            }
            System.out.println();
        }
    }
    public static long fei(long n)
    {
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        return fei(n-1)+fei(n-2);
    }
}
//    public int[][] generateMatrix(int n) {
//        /**
//         * 顺时针填表
//         * 方向：右->下->左->上
//         */
//        int[][] ans = new int[n][n];
//        int j = 0, k = -1;
//        for(int i = 1; i<=n*n;){
//            if(k+1<n && ans[j][k+1]==0){ // 向右填表
//                ans[j][++k] = i++;
//            } else if(j+1<n && ans[j+1][k]==0){ // 向下填表
//                ans[++j][k] = i++;
//            } else if(k-1>=0 && ans[j][k-1]==0){ // 向左填表
//                ans[j][--k] = i++;
//            } else{
//                //向上填表。此处需要注意的是：一旦向上，必须先把上边空的全填完，才能向右！
//                while(j-1>=0 && ans[j-1][k]==0){
//                    ans[--j][k] = i++;
//                }
//            }
//        }
//        return ans;
//    }