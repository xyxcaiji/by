package main.度小满;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long temp=0;
        for(int i=1;i<=n*3;i++){
            temp+=(i*m);
        }
        System.out.println(temp);
    }
}
