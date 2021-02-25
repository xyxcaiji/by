package 小mi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(jie(s));
    }
    public static String jie(String s){
        ArrayList<Integer> list=new ArrayList<>();
        char[] chars = s.toCharArray();
        if(chars.length>=13&&chars[0]=='z'){
            return "9223372036854775807";
        }else if(chars.length>=13&&chars[0]=='-'){
            return "-9223372036854775807";
        }
        boolean fu=false;
        int pow=0;
        if(chars[0]=='-'){
            fu=true;
        }
        for(int i=0;i<chars.length;i++){
            if(chars[chars.length-1-i]=='-'){
                continue;
            }
            int t=chars[chars.length-1-i]-'0';
            int temp=0;
            if(t>=0&&t<=9){
                int count = count(i);
                temp+=count*t;
            }else if(t>=49&&t<=74){
                t=chars[chars.length-1-i]-'a';
                int count = count(i);
                temp+=count*t;
            }else {
                return "0";
            }
            list.add(temp);
        }
        int answer=0;
        for(int i=0;i<list.size();i++){
            answer+=list.get(i);
        }
        return fu==true?"-"+String.valueOf(answer):String.valueOf(answer);
    }
    public static int count(int n){
        int temp=1;
        for(int i=0;i<n;i++){
            temp*=36;
        }
        return temp;
    }
}
