package sanliuo;

import java.util.Scanner;
/*
AATT
TTAA
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if(s1.length()>100000)
        {
            System.out.println(0);
        }
        System.out.println(find(s1,s2));
    }
    public static int find(String s1,String s2)
    {
        if(s1==null||s1.length()==0)
        {
            return 0;
        }
        if(s2==null||s2.length()==0)
        {
            return 0;
        }
        int temp=0;
        int[] ii=new int[2];
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                temp+=1;
                if(s2.charAt(i)=='A'||s2.charAt(i)=='a')
                {
                    ii[0]+=1;
                }else {
                    ii[1]+=1;
                }
            }
        }
        if(ii[1]==ii[0])
        {
            return ii[1];
        }
        if(ii[1]-ii[0]==ii[1]||ii[0]-ii[1]==ii[0])
        {
            return ii[0] - ii[1] > 0 ? ii[0] : ii[1];
        }
        return temp/2+1;
    }
}
