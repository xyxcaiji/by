package 阅文;

import lectout.二叉树检查平衡性;

public class Main {
    public static void main(String[] args) {
//       String s="作者大大00666666，为你点赞";
//        System.out.println(filter(s));
        String s="sss1";
        String s2="ss";
        String s1=s2+"s1";
        System.out.println(s==s1);
    }
    public static String filter(String s)
    {
        int temp=0;
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]>'0'&&chars[i]<='9')
            {
                if (judge(chars,i,temp))
                {
                    i=temp;
                    continue;
                }
            }
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }
    public static boolean judge(char[] chars,int i,int start)
    {
        int temp=i;
        int j=i;
        for(;i<chars.length;i++)
        {
            if(chars[i]>'0'&&chars[i]<='9')
            {
                temp+=1;
                continue;
            }
        }
        if(temp-j>=6&&temp-j<=10)
        {
            start=temp+j;
            return true;
        }
        return false;
    }
}
