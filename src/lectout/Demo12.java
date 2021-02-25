package lectout;

import java.util.Scanner;

/*
0-1背包问题
 */
public class Demo12 {
    public static void main(String[] args) {
//        int[] weight={77,22,29,50,99};
//        int[] value={92,22,36,46,90};
//        findMax(weight,value,100);
        //Scanner scanner=new Scanner(System.in);
        //int mON = scanner.nextInt();
        Scanner scanner=new Scanner(System.in);
        int money = scanner.nextInt();
        int num=scanner.nextInt();
        int[] weight=new int[num];
        int[] value=new int[num];
        for(int i=0;i<num;i++)
        {
            weight[i]=scanner.nextInt();
            value[i]=scanner.nextInt();
        }
        scanner.close();
        findMax(weight,value,money);
    }
    public static void findMax(int[] weight,int[] value,int maxWeight)
    {
        int[][] di=new int[weight.length+1][maxWeight+1];
        for(int i=1;i<=weight.length;i++)
        {
            for(int j=1;j<=maxWeight;j++)
            {
                if (i == 0) {
                    di[i][j] = 0; // 边界情况：若只有0可以选，那只能得到0。所以令V(0,j)=0
                } else if (j == 0) {
                    di[i][j] = 0; // 边界情况：若只有0可选重量，那也只能得0个物品。所以令V(i,0)=0
                }
                else{
                    if(weight[i-1]>j)
                    {
                        //当被选物品的重量大于最大重量   那么它其实就和第i-1个物品一样，不需要加入，只需要把第i-1个物品的最优价值传给他就行
                        di[i][j]=di[i-1][j];
                    }else{
                        //反之，当被选的第i个物品小于可以选择的最大重量，那就有两个选择
                        //一种是和第di[i-1][j]个一样
                        //另一种就是减去要加的重量，再加上你减去重量对应的价值    比较两个那个大
                        di[i][j]=Math.max(di[i-1][j-weight[i-1]]+value[i-1],di[i-1][j]);
                    }
                }

            }
        }
        System.out.println(di[weight.length][maxWeight]);
    }
    //完全背包
    // 完全背包：一维法-倒序
    public static int bag3(int W, int[] w, int[] v) {
        int n = w.length - 1;// 第一个值，不算
        int[] f = new int[W + 1];
        for (int i = 1; i <= n; i++)
            for (int j = W; j >= w[i]; j--)
                for (int k = 0; j - k*w[i] >=0; k++)
                    f[j] = Math.max(f[j], f[j - k*w[i]] +k* v[i]);

        return f[W]; // 最优解
    }
    // 完全背包：一维法-正序
    public static int bag45(int W, int[] w, int[] v) {
        int n = w.length - 1;// 第一个值，不算
        int[] f = new int[W + 1];
        for (int i = 1; i <= n; i++)
            for (int j = w[i]; j <= W; j++)
                f[j] = Math.max(f[j], f[j - w[i]] + v[i]);
        return f[W]; // 最优解
    }
    // 多重背包：一维法
    public static int bag4(int W, int[] w, int[] v, int[] num) {
        int n = w.length - 1;// 第一个值，不算
        int[] f = new int[W + 1];
        for (int i = 1; i <= n; i++)
            for (int j = W; j >= w[i]; j--)
                for (int k = 0; k <= num[i] && j - k * w[i] >= 0; k++) {
                    f[j] = Math.max(f[j], f[j - k * w[i]] + k * v[i]);
                }

        return f[W]; // 最优解
    }
}
