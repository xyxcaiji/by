package lectout;

import javax.sound.midi.Soundbank;

public class 正方形子矩阵 {
    public static void main(String[] args) {
        int[][] matrix={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        System.out.println(search(matrix));
    }
    public static int search(int[][] matrix)
    {
        int row=matrix.length;
        int col=row>0?matrix[0].length:0;
        int[][] dp=new int[row+1][col+1];
        int res=0;
        for(int i=1;i<=matrix.length;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(matrix[i-1][j-1]==1)
                {
                    //只有这个1 的左边下边左下都是一个 边长为2的正方形才能组成 变长尾3的正方形
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    res+=dp[i][j];
                }
            }
        }
        return res;
    }
}
