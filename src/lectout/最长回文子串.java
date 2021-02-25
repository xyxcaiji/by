package lectout;

import java.util.ArrayList;
import java.util.Arrays;

public class 最长回文子串 {
    public static void main(String[] args) {
        String s="ccabbasaabbbbaa";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s)
    {
        int[] ind=new int[2];
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            findLongest(chars,ind,i);
        }
        return s.substring(ind[0],ind[1]+1).length();
    }
    public static void  findLongest(char[] chars,int[] index,int i)
    {
        ArrayList<Character> list=new ArrayList<>();
        //查找回文数种中间的字符
        int hign=i;
        while (hign<chars.length-1&&chars[i]==chars[hign+1])
        {
            hign++;
        }
        //从中间向两边扩散
        int ans=hign;
        while (i>0&&hign<chars.length-1&&chars[i-1]==chars[hign+1])
        {
            if(list.contains(chars[i-1])){
                return;
            }
            list.add(chars[i-1]);
            hign++;
            i--;
        }
        if(hign-i>index[1]-index[0])
        {
            index[0]=i;
            index[1]=hign;
        }
        //return ans;
    }
}
