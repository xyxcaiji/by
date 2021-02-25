package main.网易;

import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String man = scanner.nextLine();
        String woman = scanner.nextLine();
        String peo = scanner.nextLine();
        int anInt = Integer.parseInt(peo);
        int[][] nums=new int[anInt][2];
        for(int i=0;i<anInt;i++){
            nums[i][0]=scanner.nextInt();
            nums[i][1]=scanner.nextInt();
        }
        HashSet<Integer> m1=new HashSet<>();
        HashSet<Integer> w1=new HashSet<>();
        int mm=1;
        int ww=1;
        int max=0;
        int wax=0;
        for(int i=0;i<anInt-1;i++){
            if(nums[i][0]==nums[i-1][0]){
                mm++;
            }else {
                max=Math.max(mm,max);
                mm=1;
            }
            if(nums[i][1]==nums[i-1][1]){
                ww++;
            }else {
                wax=Math.max(wax,ww);
                ww=1;
            }
            m1.add(nums[i][0]);
            w1.add(nums[i][1]);
        }
        int answer=m1.size()>w1.size()?w1.size():m1.size();
        if(wax>=anInt/2||max>=anInt/2){
            answer--;
        }
        System.out.println(max);
        System.out.println(wax);
        System.out.println(answer);
    }
}
