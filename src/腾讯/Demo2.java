package 腾讯;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        int k = scanner.nextInt();
        find(next,k,0,"");
    }
    public static void find(String next,int k,int j,String s)
    {
        if(k<=0)
        {
            System.out.println(s);
        }
        char[] chars = next.toCharArray();
        char min=chars[j];
        int i=j;
        for(;i<chars.length;i++)
        {
            if(min>chars[i])
            {
                min=chars[i];
            }
        }
        System.out.println(min+"=="+i);
        find(next,k--,i,s+min);
    }
}
