package 中兴;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] s=new String[n];
//        for(int i=0;i<n;i++)
//        {
//            s[i]=scanner.nextLine();
//        }
//        find(s);
    }
    public static void find(String[] strings)
    {
        for(int i=0;i<strings.length;i++)
        {
            String[] split = strings[i].split(" ");
            long l = Long.parseLong(split[1]);
            long r = Long.parseLong(split[2]);
            long temp=0;
            char[] chars = split[0].toCharArray();
            for(int j=0;j<chars.length;j++)
            {
                if(chars[i]=='0')
                {
                    //temp+=3;
                }
                temp+=(long)chars[i];
            }
        }
    }
}
