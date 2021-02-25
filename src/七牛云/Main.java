package 七牛云;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]= scanner.next();
        }
        for(int j=0;j<s.length;j++)
        {
            judge(s[j]);
        }
    }
    public static void judge(String s)
    {
        boolean b=true;
        char[] chars=new char[26];
        char[] chars1 = s.toCharArray();
        for(int i=0;i<chars1.length;i++)
        {
            chars[chars1[i]-'A']+=1;
        }
        for(int j=0;j<chars.length;j++)
        {
            if(chars[j]%2!=0)
            {
                b=false;
            }
        }
        if(b==false)
        {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
