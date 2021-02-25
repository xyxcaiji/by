package jdbs;

import java.math.BigDecimal;
import java.net.Socket;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
    }
    public static void count(int n)
    {
        double temp=0.0000;
        for(int i=1;i<=n;i++)
        {
            double t1=(1.0/(5*(2*i-1)));
            double t2=(1.0/(5*2*i));
//            System.out.println(t1+"   "+t2);
            temp+=(t1-t2);
        }
        //System.out.println(temp);
        BigDecimal bigDecimal=new BigDecimal(temp);
        System.out.println(bigDecimal.setScale(4,BigDecimal.ROUND_HALF_UP));
    }
}
