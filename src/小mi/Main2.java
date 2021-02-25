package 小mi;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m = s.nextInt();
        if(m<0||m>15){
            System.out.println(0);
            return;
        }
        int[] arr=new int[16];
        arr[1]=1;
        arr[2]=2;
        arr[3]=5;
        arr[4]=14;
        for(int i=5;i<=15;i++){
            int temp=0;
            for(int j=0;j<i/2;j++){
                temp+=arr[i-j-1];
            }
            temp*=2;
            if(i%2==1){
                temp+=arr[i-i/2-1];
            }
            arr[i]=temp;
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[m]);
    }
}
