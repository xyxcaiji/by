package 微众银行;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings=new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]=scanner.next();
        }
        hui(strings);
    }
    public static void hui(String[] strings)
    {
        for(int i=0;i<strings.length;i++)
        {
            //A=65 a=97 26个字母
            int[] num=new int[58];
            for(char c:strings[i].toCharArray())
            {
                num[c-'a']+=1;
            }
//            int max=0;
//            for(int x:num)
//            {
//                //x如果是1那么就不累加  我们需要的是字符为偶数个的  字符数为奇数舍弃
//                max+=x-(x&1);
//            }
            int temp=0;
            for(int n:num)
            {
                //如果对2取余是1，证明不可能成为回文数
                if(n%2==1)
                {
                    temp+=1;
                }
            }
            //如果max小于字符串长度，那么证明有字符为单数 所以可以—+1
            if(temp%2==1) System.out.println("Cassidy");
            else System.out.println("Eleanore");
        }
    }
}
