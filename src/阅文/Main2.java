package 阅文;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(demp("hellohehe"));
    }
    public static char demp(String s)
    {
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            int index=judge(chars,i);
            System.out.println(index);
            if(index==1)
            {
                return chars[i];
            }
        }
        return '1';
    }
    public static int judge(char[] chars,int i)
    {
        int temp=i;
        i+=1;
        for(;i<chars.length;i++)
        {
            if(chars[i]==chars[temp])
            {
                return 2;
            }
        }
        return 1;
    }
}
