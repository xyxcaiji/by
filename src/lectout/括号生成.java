package lectout;
/**
 * 今天完成了括号生成，明天看一下括号判断
 */

import Demo.Lis;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {
    static ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
    public static ArrayList<String> generateParenthesis(int n) {
        dfs(n,n,"");
        return list;
    }
    //深度
    public static void dfs(int left,int right,String temp)
    {
        if(left==0&&right==0)
        {
            list.add(temp);
            return;
        }
        if(left>0)
        {
            dfs(left-1,right,temp+"(");
        }
        if(right>left)
        {
            dfs(left,right-1,temp+")");
        }
    }
}
