package 腾讯;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        int n=scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++)
        {
            nums[i][0]=scanner.nextInt();
            nums[i][1]=scanner.nextInt();
        }
        find(nums,n,str);
    }
    public static void find(int[][] nums,int n,String str)
    {
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            int[] ind=new int[2];
            String substring = str.substring(nums[i][0] - 1, nums[i][1]);
            //System.out.println(substring);
            String s = longestPalindrome(substring,ind);
            if(s.length()==substring.length())
            {
                temp[i]=1;
                continue;
            }
            if(s.length()+1==substring.length())
            {
                temp[i]=2;
            }else {
//                temp[i]=1+substring.length()-s.length();
                String s1 = substring.substring(0, ind[0]);
                String s2 = substring.substring(ind[1], substring.length());
                int[] tt=new int[2];
                if(longestPalindrome(s1,tt).length()==s1.length())
                {
                 temp[i]+=2;
                }else {
                    temp[i]+=3;
                }
                if(longestPalindrome(s2,tt).length()==s2.length())
                {
                    temp[i]+=1;
                }else {
                    temp[i]+=2;
                }
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
    public static String longestPalindrome(String s,int[] ind)
    {

        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            findLongest(chars,ind,i);
        }
        return s.substring(ind[0],ind[1]+1);
    }
    public static void  findLongest(char[] chars,int[] index,int i)
    {
        int hign=i;
        while (hign<chars.length-1&&chars[i]==chars[hign+1])
        {
            hign++;
        }
        int ans=hign;
        while (i>0&&hign<chars.length-1&&chars[i-1]==chars[hign+1])
        {
            hign++;
            i--;
        }
        if(hign-i>index[1]-index[0])
        {
            index[0]=i;
            index[1]=hign;
        }
    }
}
