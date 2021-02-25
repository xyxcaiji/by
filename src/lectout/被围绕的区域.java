package lectout;

import java.text.DateFormatSymbols;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 *
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *
 * 示例:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surrounded-regions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 被围绕的区域 {
    public static void main(String[] args) {
        char[][] board={
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        solve(board);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void solve(char[][] board)
    {
        int row,col;
        if(board==null||board.length==0)
        {
            return;
        }
        row=board.length;
        col=board[0].length;
        //对第一列 和最后一列 赋值
        //对第一行和最后一行的所有O进行深度优先搜索
        for(int i=0;i<row;i++)
        {
            dfs(board,i,0);
            dfs(board,i,col-1);
        }
        //对第一列和最后一列的所有O进行深度优先搜索
        for(int j=0;j<col;j++)
        {
            dfs(board,0,j);
            dfs(board,row-1,j);
        }
        //将剩下的所有o换成 x  y换成0
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }else if(board[i][j]=='Y')
                {
                    board[i][j]='O';
                }
            }
        }
    }
    /*
    递归进行深度优先搜索
     */
    public static void dfs(char[][] board,int i,int j)
    {
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!='O')
        {
            return;
        }
        board[i][j]='Y';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
        return;
    }
}
