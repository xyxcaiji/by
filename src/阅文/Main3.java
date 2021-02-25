package 阅文;

import org.jcp.xml.dsig.internal.dom.DOMCryptoBinary;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(juder(23));
    }
    public static int juder(int num)
    {
        int count=0;
        String s = Integer.toBinaryString(num);
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]=='1')
            {
                count+=1;
            }
        }
        return count;
    }
}
