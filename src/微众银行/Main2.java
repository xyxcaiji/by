package 微众银行;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(findMin(n,m,a,b));
    }
    public static int findMin(int n,int m,int a,int b)
    {
        if(n<1||m<1||a>100||b>100)
        {
            return 0;
        }
        if(m%n==0)
        {
            return 0;
        }
        int qian1=0;
        int qian2=0;
        //发红包的钱
        qian1 = hongBao(n, m, a);
        qian2 = buyLiWu(n,m,b);
        return qian1-qian2>=0?qian2:qian1;
    }
    //发红包
    public static int hongBao(int n,int m,int a)
    {
        int i=0;
        if(n>m)
        {
            int j=n-m;
            return j*a;
        }
        while (m%n==0)
        {
            n-=1;
            i+=1;
            if(m%n==0)
            {
                break;
            }
        }
        return i*a;
    }
    //买礼物
    public static int buyLiWu(int n,int m,int b)
    {
        if(n>m)
        {
            return (n-m)*b;
        }
        int i= n-(m%n);
        return i*b;
    }
}
