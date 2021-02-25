package jdbs;

import sun.reflect.annotation.AnnotationSupport;

import java.util.Scanner;

/**
 * 最大子序列和
 */
public class Main2 {
    static int answer=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        find(n,m);
        System.out.println(answer);
    }
    public static void find(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            mySplit(i);
        }
    }
    public static void mySplit(int n)
    {
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++)
        {
            StringBuilder temp=new StringBuilder(str);
            temp.replace(i,i+1,"0");
            String replace = temp.toString().replaceFirst("0", " ");
            String replace2 = replace.replaceAll(" ", "");
            String trim = replace2.trim();
            Integer integer = Integer.valueOf(trim);
            if(reserve(integer)==1)
            {
                answer+=1;
            }
        }
    }
    public static int reserve(int n)
    {
        int temp=n;
        int rs=0;
        while (n!=0)
        {
            rs=rs*10+n%10;
            n=n/10;
        }
        //System.out.println(rs);
        if(rs==temp)
        {
            int i=2;
            for(;i<temp;i++)
            {
                if(temp%i==0) break;
            }
//            System.out.println("i="+i);
//            System.out.println("n="+temp);
            if(temp==i){
                return 1;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }
}
