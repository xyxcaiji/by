package 爱奇艺;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++) {
            int j = i;
            while (j % 5 == 0){
                count++;
                j/=5;
            }
        }
        return count;
    }
}
