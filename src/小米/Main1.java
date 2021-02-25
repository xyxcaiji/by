package 小米;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        String[] miMa = line.split(" ");
        scanner.close();
        for(int i=0;i<miMa.length;i++){
            char[] chars = miMa[i].toCharArray();
            if(chars.length<8||chars.length>120){
                System.out.println(1);
                continue;
            }else {
                HashSet<Integer> set=new HashSet<>();
                for(int j=0;j<chars.length;j++){

                    if(chars[j]>='0'&&chars[j]<='9'){
                        set.add(1);
                    }else if(chars[j]>='a'&&chars[j]<='z'){
                        set.add(2);
                    }else if(chars[j]>='A'&&chars[j]<='Z'){
                        set.add(3);
                    }else {
                        set.add(4);
                    }
                }
                if(set.size()==4){
                    System.out.println(0);
                }else {
                    System.out.println(2);
                }
            }
        }
    }
}
