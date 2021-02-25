package 哔哩哔哩;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        String s="  ";
        System.out.println(s.trim().length());
        System.out.println(judge("([)]"));
    }
    public static boolean judge(String s)
    {
        if(s==null||s.length()==0) return true;
        Stack<Character> stack=new Stack<>();
        char[] chars = s.toCharArray();
        if(s.length()%2!=0) return false;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]=='(')
            {
                stack.push(')');
            }else if(chars[i]=='{')
            {
                stack.push('}');
            }else if(chars[i]=='[')
            {
                stack.push(']');
            }else if(chars[i]==' '){
                continue;
            } else {
                if(stack.peek()==chars[i])
                {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
