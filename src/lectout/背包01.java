package lectout;

public class 背包01 {
    public static void main(String[] args) {
        int[] weight={4,3,5};
        int[] value={5,4,6};
        System.out.println(bag1(10,weight,value));
        System.out.println(bag2(10,weight,value));
        System.out.println(bag3(10,weight,value));
    }
    //01背包二维数组
    public static int bag1(int W, int[] w, int[] v){
        int[][] dp=new int[w.length+1][W+1];
        for(int i=1;i<=w.length;i++)
        {
            for(int j=1;j<=W;j++)
            {
                if(j<w[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+v[i-1]);
                }
            }
        }
        return dp[w.length][W];
    }
    // 0,1背包：一维法
    public static int bag2(int W, int[] w, int[] v) {
        int[] f = new int[W + 1];
        for (int i = 1; i <= w.length; i++)
            for (int j = W; j >= 1; j--){
                if (w[i-1]<=j)
                {
                    f[j]=Math.max(f[j],f[j-w[i-1]]+v[i-1]);
                }
            }

        return f[W]; // 最优解
    }
    //完全背包  一维数组
    public static int bag3(int W, int[] w, int[] v) {
        int[] f = new int[W + 1];
        for (int i = 1; i <= w.length; i++)
            for (int j = 1; j <=W;j++){
                if (w[i-1]<=j)
                {
                    f[j]=Math.max(f[j],f[j-w[i-1]]+v[i-1]);
                }
            }

        return f[W]; // 最优解
    }
}
