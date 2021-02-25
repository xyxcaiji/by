package kaoshi;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        String[] strings=new String[n];
        for(int i=0;i<n;i++){
            strings[i]=scanner.next();
        }
        int m=scanner.nextInt();
        String[] strings1=new String[m];
        for(int j=0;j<m;j++){
            strings1[j]=scanner.next();
        }
        int duan = duan(strings, strings1);
        System.out.println(duan);

    }
    public static int duan(String[] s1,String[] s2)
    {
        int temp=0;
        int j=s1.length;
        for(int i=s2.length-1;i>0;i--)
        {
            for(String m:s1)
            {
                if(s2[i].equals(m))
                {
                    temp=i;
                    break;
                }

            }
        }
        int value=0;
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].equals(s2[temp]))
            {
                value=i-0;
            }
        }
        return value;
    }
}
