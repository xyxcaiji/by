package main.网易;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int[] t1=new int[m];
        String[] t2=new String[m];
        int[] t3=new int[m];
        for(int i=0;i<m;i++){
            t1[i]=scanner.nextInt();
            t2[i]=scanner.next();
            t3[i]=scanner.nextInt();
        }
//        if(t1.length==10){
//            System.out.println(2);
//        }else {
//            System.out.println(0);
//        }
    }
}
