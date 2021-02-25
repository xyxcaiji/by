package gensheixue;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        System.out.println( reserveParentheses("i(abcd)u"));
    }
    public static String reserveParentheses(String s)
    {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp==')')
            {
                StringBuilder tempBuild=new StringBuilder();
                while (stack.peek()!='(')
                {
                    tempBuild.append(stack.pop());
                }
                stack.pop();
                for(int j=0;j<tempBuild.length();j++)
                {
                    stack.push(tempBuild.charAt(j));
                }
            }else {
                stack.push(temp);
            }
        }
        while (!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
