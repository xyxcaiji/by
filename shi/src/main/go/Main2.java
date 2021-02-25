package main.go;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s1=new String[n];
        String[] s2=new String[n];
        for(int i=0;i<n;i++){
            s1[i]=scanner.next();
            s2[i]=scanner.next();
        }
        for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            String s = s1[i].toUpperCase();
            boolean b=true;
            char[] chars = s2[i].toUpperCase().toCharArray();
            for(int j=0;j<chars.length;j++){
                if(s.contains(chars[j]+"")){
                    set.add(chars[j]);
                }
            }
            if(set.size()==chars.length){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
