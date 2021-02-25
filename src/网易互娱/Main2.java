package 网易互娱;

import ali.Test;

import java.io.Reader;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();
        //System.out.println(substring);
        System.out.println(compress(s));
    }
    public static String compress(String raw_str){
        System.out.println(raw_str.length());
        char[] chars = raw_str.toCharArray();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<chars.length;){
            if((chars[i]>90&&chars[i]<97)||chars[i]>122||chars[i]<65){
                return null;
            }
            int count = count(i, chars);
            if(count==1){
                sb1.append(chars[i]);
                i+=1;
            }else if(count>1&&count<4){
                for(int j=0;j<count;j++){
                    sb1.append(chars[i]);
                }
                i+=count;
            }else if(count>=4&&count<=55){
                sb1.append(0);
                if(count<=29){
                    char temp= (char) ('a'+(count-4));
                    sb1.append(temp);
                }else {
                    char temp= (char) ('A'+(count-4-26));
                    sb1.append(temp);
                }
                sb1.append(chars[i]);
                i+=count;
            }else if(count>55){
                int te=count;
                while (count>=55){
                    sb1.append('0');
                    sb1.append('Z');
                    sb1.append(chars[i]);
                    count-=55;
                }
                sb1.append(0);

                if(count<=29){
                    char temp= (char) ('a'+(count-4));
                    sb1.append(temp);
                }else {
                    char temp= (char) ('A'+(count-4-26));
                    sb1.append(temp);
                }
                sb1.append(chars[i]);
                i+=te;
            }
        }
        if(sb1.toString().length()>raw_str.length()){
            return raw_str;
        }
         return sb1.toString();
    }
    public static int count(int j,char[] chars){
        int tmep=0;
        for(int i=j;i<chars.length;i++){
            if(chars[i]==chars[j]){
                 tmep++;
            }else {
                break;
            }
        }
        return tmep;
    }
}
