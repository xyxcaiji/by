package main.网易;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        char[] chars=str.toCharArray();
        int max=0;
        int temp=0;
        for(int i=0;i<chars.length;){
            int kua=0;
            if(chars[i]=='a'||chars[i]=='b'||chars[i]=='c'||chars[i]=='x'||chars[i]=='y'||chars[i]=='z'){
                kua = findMax(i, chars);
            }else {
                i++;
                temp=0;
                continue;
            }
            if(kua==-1){
                i++;
                temp=0;
                continue;
            }
            temp=temp+(kua-i)+1;
            i=kua+1;
            max=Math.max(temp,max);
        }
        System.out.println(max);
    }
    public static int findMax(int i,char[] chars){
        ArrayList<Integer> list=new ArrayList<>();
        int t=0;
        for(int j=i;j<chars.length;j++){
            if(chars[j]==chars[i]){
                t++;
                list.add(j);
            }
        }
        int n=list.size();
        if(n%2==0){
            return list.get(n-1);
        }
        return -1;
    }
}
