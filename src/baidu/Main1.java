package baidu;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String[] chars=new String[n];
        for(int i=0;i<n;i++)
        {
            chars[i]=scanner.next();
        }
        chu(chars);
    }
    public static void  chu(String[] sts)
    {
        int temp=0;
        int t2=0;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sts.length;i++)
        {
            if(sts[i].equals("5"))
            {
                t2++;
            }else {
                temp++;
            }
        }
        if(temp==0)
        {
            System.out.println(-1);
            return;
        }else if(t2<9)
        {
            System.out.println(-1);
            return;
        }else {
            String s="555555555";
            for(int i=0;i<t2/9;i++)
            {
                sb1.append(s);
            }
            for(int i=0;i<temp;i++)
            {
                sb1.append("0");
            }
            System.out.println(sb1.toString());
        }

    }
//

}
