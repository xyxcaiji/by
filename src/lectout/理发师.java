package lectout;

import java.util.Arrays;
import java.util.Scanner;

public class 理发师 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int[] times=new int[n];
        for(int i=0;i<n;i++)
        {
            times[i]=scanner.nextInt();
        }
    }
    public static void fc(int m,int n,int[] times){
        Arrays.sort(times);

    }
}
