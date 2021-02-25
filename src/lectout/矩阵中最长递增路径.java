package lectout;

public class 矩阵中最长递增路径 {
    private static int[][] nums={{9,9,4},
                  {6,6,8},
                  {2,1,1}};
    static int[][] dp=new int[3][3];
//    static int ans=0;
    public static void main(String[] args) {
        System.out.println(longestIncreasingPath(nums));
    }
    public static int longestIncreasingPath(int[][] matrix) {
        int max=0;
        if(matrix==null) return 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
              max=Math.max(max,dfs(i,j,matrix[i][j]-1));
            }
        }
        return max;
    }
    public static int dfs(int row,int col,int value)
    {
        if(!(row>=0&&row<nums.length&&col>=0&&col<nums[0].length)||value>=nums[row][col])
            return 0;
        //之前遍历到过  直接返回他的值
        if(dp[row][col]>0) return dp[row][col];
        //记忆法确定他已经被用过了
        dp[row][col]=1;
        //value就是它的值
        value=nums[row][col];
        //他的上下左右
        int max=dfs(row-1,col,value)+1;
        max=Math.max(max,dfs(row+1,col,value)+1);
        max=Math.max(max,dfs(row,col-1,value)+1);
        max=Math.max(max,dfs(row,col+1,value)+1);

        dp[row][col]=max;
//        ans=Math.max(ans,max);
        return max;
    }

}
