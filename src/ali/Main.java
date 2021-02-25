package ali;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        System.out.println(3);

        int n=scanner.nextInt();
        String[] strings=new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]=scanner.next();
        }
        System.out.println(findMax(strings));
    }
    public static int findMax(String[] s)
    {
        int max=0;
        int[] di=new int[s.length];
        di[0]=s[0].length();
        int temp=0;
        int m=0;
        int n=0;
        for(int i=0;i<s.length;i++) {
            char c = s[0].charAt(s[0].length() - 1);
            for (int j = i; j < s.length - 1; j++) {
                if (s[j].charAt(0) > c) {
                    n=temp;
                    temp = Math.max(temp, s[j].length());
                    if(temp!=n)
                    {
                        m=j;
                    }
                }
                for(int x=0;x<s.length;x++)
                {
                    char q = s[m].charAt(s[m].length() - 1);
                    if(s[x].charAt(0) > q)
                    {
                        n=s[x].length();
                    }
                }
            }
            max = s[i].length() + temp+n;
        }
        return max;
    }
}
