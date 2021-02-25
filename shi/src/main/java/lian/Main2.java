package main.java.lian;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Scanner scanner=new Scanner(System.in);
//        int anInt = scanner.nextInt();
//        String str=scanner.next();
//        char[] chars = str.toCharArray();
//        StringBuilder temp=new StringBuilder();
//        StringBuilder sb=new StringBuilder();
//        int te=0;
//        for(int i=0;i<chars.length;i++){
//
//            if(te<anInt){
//                temp.append(chars[i]);
//            }
//            te++;
//            if(te==anInt||i==chars.length-1){
//                sb.append(temp.reverse().toString());
//                temp=new StringBuilder();
//                te=0;
//            }
//        }
//        System.out.println(sb.toString());

        String s=new String("1")+new String("1");
        String s2="11";
        s.intern();

        System.out.println(s==s2);
    }
}
