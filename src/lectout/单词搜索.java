package lectout;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 单词搜索 {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,"ABCCED"));
    }
    public static boolean exist(char[][] bpard,String world)
    {
        for(int i=0;i<bpard.length;i++)
        {
            for(int j=0;j<bpard[0].length;j++)
            {
                if (search(bpard, world, i, j, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,String world,int i,int j,int k)
    {
        if(k>=world.length()) return true;
        if(i<0||i>=board.length||j>=board[0].length||j<0||board[i][j]!=world.charAt(k)) return false;
        board[i][j]+=256;
        boolean result=search(board,world,i-1,j,k+1)||search(board,world,i,j+1,k+1)||search(board,world,i+1,j,k+1)||search(board,world,i,j-1,k+1);
        board[i][j]-=256;
        return result;
    }
}
