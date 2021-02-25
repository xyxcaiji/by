package lectout;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 不同路径 {
    public static void main(String[] args) {
        int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
        //int[][] obstacleGrid={{1,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h=obstacleGrid.length;
        int l=obstacleGrid[0].length;
        int[][] temp=new int[h+1][l+1];
        if(h<1||l<1)
        {
            return 0;
        }
        //如果obstacleGrid[0][0]==1  证明开始就是个障碍 后面坑定是0
        temp[1][1]=obstacleGrid[0][0]==1?0:1;
        for(int i=1;i<temp.length;i++)
        {
            for(int j=1;j<temp[0].length;j++)
            {
                //(i!=1||j!=1)  这个的作用就是不要去修改 temp[1][1]的值
                if((i!=1||j!=1)&&obstacleGrid[i-1][j-1]!=1)
                {
                    temp[i][j]=temp[i-1][j]+temp[i][j-1];
                }
            }
        }
        return temp[h][l];
    }
}
