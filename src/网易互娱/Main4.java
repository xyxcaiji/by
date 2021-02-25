package 网易互娱;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long s = scanner.nextLong();
        long e = scanner.nextLong();
        if(e<(s*2)){
            System.out.println(e-s);
            System.out.println(2);
            System.out.println(s+" "+e);
            return;
        }else if(e%s==0){
            System.out.println(0);
            System.out.println(2);
            System.out.println(s+" "+e);
            return;
        }
        long[] temp=new long[8];
        findMin(s,e,temp);
        long te=0;
        long min=Integer.MAX_VALUE;
        for(int i=1;i<temp.length;i++){
            min=Math.min(min,temp[i]);
            if(min==temp[i]){
                te=i;
            }
        }
        System.out.println(min);
    }
    public static void findMin(long s,long e,long[] temp){
        if(s<1||s>7||temp[(int) s]!=0){
            return;
        }
        long n=e%s;
        temp[(int)s]=n;
        findMin(s-1,e,temp);
        findMin(s+1,e,temp);
    }
}
