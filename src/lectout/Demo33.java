package lectout;

import java.util.Stack;

/*
 正确的括号
 */
public class Demo33 {
    public static void main(String[] args) {
        System.out.println(hua(")()"));
    }
    public static boolean hua(String strings)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:strings.toCharArray())
        {
            //第一次先直接入栈
            if(stack.size()==0)
            {
                stack.push(c);
            }else if(kuo(stack.peek(),c))//判断第二个字符 与 第一个字符能不能组成一个完整的括号
            {
                stack.pop();
            }else{
                //如果第二部不能组成完整的括号，就再次入栈
                stack.push(c);
            }
        }
        //如果是正确 括号，最后size==0；
        return stack.size()==0;
    }
    public static boolean kuo(char c1,char c2)
    {
        return (c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}');
    }
}
