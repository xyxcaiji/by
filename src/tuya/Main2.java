package tuya;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        judge(line);
    }
    public static void judge(String line)
    {
        if(line.contains("m")||line.contains("w")){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> list=new ArrayList<>();
        char[] chars = line.toCharArray();
        for(int i=0;i<chars.length;)
        {
            if(chars[i]=='n')
            {
                int[] ns = judge(i, chars, 'n');
                i+=ns[0];
                list.add(ns[1]);
            }else if(chars[i]=='u'){
                int[] ns = judge(i, chars, 'u');
                i+=ns[0];
                list.add(ns[1]);
            }else {
                i++;
            }
        }
        long l=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            l*=list.get(i);
        }

        System.out.println(l%(10^9+7));
    }
    public static int[] judge(int i,char[] chars,char c)
    {
        int[] t=new int[2];
        int temp=0;
        for(;i<chars.length;i++)
        {
            if(chars[i]==c){
                temp++;
            }else {
                break;
            }
        }
        if(temp==1)
        {
            t[0]=1;
            t[1]=1;
            return t;
        }else if(temp==2)
        {
            t[0]=2;
            t[1]=2;
            return t;
        }else {
            int[] dp=new int[temp+1];
            dp[1]=1;
            dp[0]=1;
            for(int j=2;j<dp.length;j++)
            {
                dp[j]=dp[j-2]+dp[j-1];
            }
            t[0]=temp;
            t[1]=dp[temp];
            return t;
        }
    }
}
