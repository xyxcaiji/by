package lectout;

import javax.swing.text.Highlighter;

/*
 最长火回文子串
 */
public class Demo22 {
    public static void main(String[] args) {
        String s="bcbbabb";
        System.out.println(findMax(s));
    }
    public static String findMax(String s)
    {
        if(s==null||s.length()==0)
        {
            return "";
        }
        //记录回文子串的 起始位子
        int[] range=new int[2];
        char[] str=s.toCharArray();
        //记录每个字符最长回文子串
        for(int i=0;i<s.length();i++)
        {
            //把回文堪称中间部分群是同一字符，左右不分相对称
            //找到下一个与当前字符不同的字符
            i=findLongest(str,i,range);
        }
        return s.substring(range[0],range[1]+1);
    }
    public static int findLongest(char[] str,int low,int[] range)
    {
        //查找中间部分
        int high=low;
//        while (high<str.length-1&&str[low]==str[high+1])
//        {
//            high++;
//        }
        //这是碰到了字符不想等的时候
        int ans= high;
        //         从中间向左右扩散
        while (low>0&&high<str.length-1&&str[low-1]==str[high+1])
        {
            low--;
            high++;
        }
        //         记录最大长度
        if(high-low>range[1]-range[0])
        {
            range[0]=low;
            range[1]=high;
        }
        return ans;
    }
}
