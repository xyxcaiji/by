package 贝壳;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String str=scanner.next();
        System.out.println(find(str));
    }
    public static int find(String s)
    {
        int swap=0;
        int len=s.length()-1;
        if(s.length()<=1) return 0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-i))
                swap++;
        }
        return swap;
    }
}
