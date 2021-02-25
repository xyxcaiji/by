package 疯狂游戏;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(findLen(s));
    }
    public static int findLen(String s)
    {
        char[] chars = s.toCharArray();
        int start=0;
        int end=0;
        int len=0;
        for(int j=0;j<chars.length;j++)
        {
            if(chars[j]=='2')
            {
                start=j;
            }
            for(int i=start;i<chars.length;i++)
            {
                if(chars[i]=='5')
                {
                    end=i;
                }
            }
//            System.out.println(start+"..");
//            System.out.println(end+"...");
            if(chars[start]=='2'&&chars[end]=='5')
            {
                len=Math.max((end-start),len);
            }
        }
        if(len!=0)
        {
            len=len+1;
        }
        return len;
    }
}
