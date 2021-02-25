package 吉比特;

import Demo.Lis;

import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s1 = scanner.next();
//        String s2 = scanner.next();
//        System.out.println(judge(s1,s2));
        String s = Integer.toBinaryString(2);
        s.toCharArray();
        System.out.println();
    }
    public static int judge(String s1,String s2)
    {
        int max=0;
        boolean b=false;
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        List<Integer> list=new ArrayList();
            for(int j=0;j<chars.length;j++)
            {
                if(chars1[0]==chars[j])
                {
                   list.add(j);
                }
            }
        Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext())
            {
                Integer next = iterator.next();
                        for (int j = next+1; j < chars.length; j++) {
                            for(int i=1;i<chars1.length;) {
                                if (chars[j] == chars1[i]) {
                                    b = true;
                                    break;
                                } else {
                                    b = false;
                                }
                            }
                        }

                 if(b)
                 {
                     max=Math.max(next,max);
                 }
            }
            if(max!=0)
            {
                return max+1;
            }
            return 0;
    }
}
