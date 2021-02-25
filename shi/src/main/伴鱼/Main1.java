package main.伴鱼;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(baseNeg2(2));
    }
    public static String baseNeg2(int N){
        if(N==1){
            return "0";
        }
        int temp=0;
        int wei=0;
        while (temp<N*2){
            temp= (int) Math.pow(2,wei++);
        }
        StringBuilder sb1=new StringBuilder();
        for(int i=wei;i>=0;i--){
            int n= (int) Math.pow(2,wei);
            if(wei%2!=0){
                n*=-1;
            }
            if(n<N){
                continue;
            }else {
                N-=n;
                sb1.append("1");
            }
        }
        return sb1.reverse().toString();
    }
}
