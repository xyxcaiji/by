package main.安恒;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while (scanner.hasNext()){
            String anInt = scanner.next();
            if(anInt==null||anInt.length()==0){
                scanner.close();
                break;
            }
            list.add(anInt);
        }
        System.out.println(list);

//        String line = scanner.nextLine();
//        String[] s = line.split(" ");
//        int[] moneys=new int[s.length-1];
//        int money=0;
//        for(int i=0;i<s.length;i++){
//            if(i==s.length-1){
//                money=Integer.parseInt(s[i]);
//                break;
//            }
//            moneys[i]=Integer.parseInt(s[i]);
//        }
//        int min=0;
//        Arrays.sort(moneys);
//        for(int i=moneys.length-1;i>=0;i--){
//            while ((int)moneys[i] <= money){
//               money-=(int)moneys[i];
//               min++;
//            }
//        }
//        if(min==0){
//            System.out.println(-1);
//        }else {
//            System.out.println(min);
//        }

    }
}
