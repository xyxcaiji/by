package lectout;

import Demo.Lis;

import java.util.ArrayList;
import java.util.List;

/*
生成括号
给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

例如，给出 n = 3，生成结果为：
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class Demo34 {
    public static void main(String[] args) {

        System.out.println(dfs(3));
    }
    public static List<String> dfs(int n)
    {
        List<String> list=new ArrayList<>();
        generateParenthesis(list,0,0,n,"");
        return list;
    }
    public static void generateParenthesis(List<String> list,int l,int r,int n,String cur)
    {
        if(r>l||l>n)
        {
            return;
        }
        if(r==l&&l==n)
        {
            list.add(cur);
            return;
        }
        generateParenthesis(list,l+1,r,n,cur+"(");
        generateParenthesis(list,l,r+1,n,cur+")");
    }
}
