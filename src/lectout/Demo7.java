package lectout;
/*
最大岛屿问题
dfs深度遍历
 */
public class Demo7 {
    public static void main(String[] args) {
        int[][] nums={
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int i = maxArea(nums);
        System.out.println(i);
    }
    public static int maxArea(int[][] nums)
    {
        int result=0;
        //遍历每一个数组元素
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(nums[i][j]==1)
                {
                    //记住每次找到的最大的岛屿
                    result=Math.max(finMax(nums,i,j),result);
                }
            }
        }
        return result;
    }
    public static int finMax(int[][] nums,int i,int j)
    {
        /*
        如果递归回来的
        i<0   j<0  i>=nums.length超出范围  j>=nums[0].length超出范围
        nums[i][j]!=1 为什么会有不等于1的 因为刚刚开始传进来的值为一，不代表传进来的它的上下左右都是一
        都统统return 0 让其停止递归
         */
        if(i<0||j<0||i>=nums.length||j>=nums[0].length||nums[i][j]!=1)
        {
            return 0;
        }
        //为了让遍历过的岛屿不再被遍历  让他赋值为0
        nums[i][j]=0;
        //因为自己是1  所以加个1  然后再看看上下左右有没有岛屿 也就是元素为1的岛  有就加上
        return 1+finMax(nums,i+1,j)+finMax(nums,i-1,j)+finMax(nums,i,j-1)+finMax(nums,i,j+1);
    }
}
