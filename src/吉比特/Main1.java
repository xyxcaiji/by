package 吉比特;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        String[] s = line.split(" ");
        String str=s[0].toLowerCase();
        char s1=s[1].toLowerCase().charAt(0);
        char s2=s[2].toLowerCase().charAt(0);
        char[] chars = str.toCharArray();
        int max=-1;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==s1)
            {
                for(int j=chars.length-1;j>=i;j--)
                {
                    if(chars[j]==s2)
                    {
                        max=Math.max(max,j-i);
                    }
                }
            }
            if(chars[i]==s2)
            {
                for(int j=chars.length-1;j>=i;j--)
                {
                    if(chars[j]==s1)
                    {
                        max=Math.max(max,j-i);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
