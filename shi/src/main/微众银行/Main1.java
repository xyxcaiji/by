package main.微众银行;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] nums = new int[n];
        int[] cha = new int[q];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        for(int i=0;i<q;i++){
            cha[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        for(int j=0;j<q;j++){
            int abs=0;
            int temp=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int te=Math.abs(nums[i]-cha[j]);
                if(te<=temp){
                    temp=te;
                    abs=i;
                }else {
                    break;
                }
            }
            System.out.println(nums[abs]);
        }
    }
}
