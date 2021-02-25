package 奇虎360;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String[] s=new String[num];
        for(int i=0;i<num;i++)
        {
            s[i]=scanner.next();
        }
        System.out.println(judge(s));
    }
    public static int judge(String[] strs)
    {
        int temp=0;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].contains("/")||strs[i].contains("_")||strs[i].length()>10) continue;
            if(strs[i].contains("1")||strs[i].contains("2")||strs[i].contains("3")
                    ||strs[i].contains("4")||strs[i].contains("5")||strs[i].contains("6")
                    ||strs[i].contains("7")||strs[i].contains("8")||strs[i].contains("9")
                    ||strs[i].contains("0")) continue;
            else {
                temp++;
            }
        }
        return temp;
    }
}
