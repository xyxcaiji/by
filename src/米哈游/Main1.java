package 米哈游;

import ali.Test;

import java.beans.beancontext.BeanContext;
import java.math.BigDecimal;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        ji(s);
    }
    public static void ji(String[] s)
    {
        String[] s1 = s[0].split("/");
        double d1=(double)Integer.parseInt(s1[0])/Integer.parseInt(s1[1]);
        String[] s2 = s[2].split("/");
        double d2=(double)Integer.parseInt(s2[0])/Integer.parseInt(s2[1]);
        double v=0;
        if(s[1].equals("+"))
        {
            v = d1 + d2;

        }
        if(s[1].equals("-"))
        {
            v = d1 - d2;
        }
        if(s[1].equals("*"))
        {
            v = d1 * d2;
        }
        if(s[1].equals("/"))
        {
            v = d1 / d2;
        }
        String answer = find(v);
        System.out.println(answer);
    }
    public static String find(double value)
    {
        boolean b=true;
        if(value<0)
        {
            b=false;
            value=Math.abs(value);
        }
        double temp=0;
        for(int i=1;i<9;i++)
        {
            for(int j=2;j<100;j++)
            {
                if(((double) i/j)==value) {
                    return b == true ? i + "/" + j : "-" + i + "/" + j;
                }
            }
            if(temp==value) break;;
        }
        return "2/64";
    }
}
