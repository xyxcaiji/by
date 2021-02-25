package main.网易;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int[] lu=new int[n];
        for(int i=1;i<n;i++){
            lu[i]=scanner.nextInt();
        }
        int count=1;
        int min=0;
        for(int i=1;i<n;i++){
            if(lu[i]==0){
                min=1;
                continue;
            }
            if(lu[i]<=m&&lu[i]!=0){
                count++;
                if(lu[i]==m){
                    break;
                }
            }
            if(lu[i]==lu[i+1]){
                continue;
            }
        }
        System.out.println(count+min);
    }
}
