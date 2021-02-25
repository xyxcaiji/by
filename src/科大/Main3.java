package 科大;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] X=new int[4];
        int[] Y=new int[4];
        for(int i=0;i<4;i++)
        {
            X[i]=scanner.nextInt();
            Y[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println(judge(X,Y));
    }
    public static int judge(int[] x,int[] y)
    {
        if((y[2]>y[1])||(x[2]>x[1])||(x[0]>x[3])||(y[0]>y[3]))
        {
            return 0;
        }
        return 1;
    }
}
