package 华为;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        System.out.println(judge(chars));
    }
    public static String judge(char[] chars)
    {
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]>='0'&&chars[i]<='9')
            {
                stringBuffer.append(chars[i]);
            }
        }
        String string = stringBuffer.toString();
        int[] num=new int[string.length()];
        for(int j=0;j<string.length();j++)
        {
            num[j]=Integer.parseInt(String.valueOf(string.charAt(j)));
        }
        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
        StringBuffer s1=new StringBuffer();
        for(int k=0;k<num.length;k++)
        {
            s1.append(num[k]);
        }
        return s1.toString();
    }
}
