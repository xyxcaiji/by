package 科大;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(split1(str));
    }
    public static String split1(String s)
    {
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='-')
            {
                sb1.append(s.charAt(i));
            }
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'
                    ||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
            {
                sb1.append(s.charAt(i));
            }
        }
        return sb1.toString();
    }
}
