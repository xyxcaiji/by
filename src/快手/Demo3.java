package 快手;

import Demo.Lis;

import java.lang.reflect.Array;
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(",");
//        int[] nums=new int[s.length];
//        for(int num:nums)
//        {
//            for(int i=0;i<s.length;i++)
//            {
//                nums[i]=Integer.valueOf(s[i]);
//            }
//        }
        System.out.println(find(s));
    }
    public static  StringBuilder find(String[] s1)
    {

        StringBuilder stringBuilder=new StringBuilder();
        if(s1.length==0&&s1==null)
        {
            return stringBuilder.append("null");
        }
        int[] shun=new int[s1.length];
        int[] bao=new int[s1.length];
        int[] temp=new int[s1.length];
        Arrays.fill(bao,1);
        Arrays.fill(shun,1);
        for(int i=0;i<s1.length;i++)
        {
            for(int j=3;j<s1[i].length()-3;j++)
            {
                if(s1[i].charAt(j)==s1[i].charAt(j+1))
                {
                    bao[i]+=1;
                }
                if(s1[i].charAt(j)+1==s1[i].charAt(j+1))
                {
                    shun[i]+=1;
                }
                if(bao[i]==0&&shun[i]==0) continue;
                temp[i]=bao[i]-shun[i]>=0?bao[i]:shun[i];
            }
        }
        int d=1;
        for(int i=0;i<bao.length;i++)
        {
            if(bao[i]>2)
            {
                d=3;
            }
        }
        if(d==1)  return stringBuilder.append("null");
//
//        System.out.println(Arrays.toString(bao));
//        System.out.println(Arrays.toString(shun));
//        System.out.println(Arrays.toString(temp));
        for(int n=0;n<temp.length;n++)
        {
            if(temp[n]<=2) continue;

            if(temp.length-1==n)
            {
                stringBuilder.append(s1[n]);
                continue;
            }
            stringBuilder.append(s1[n]+",");
        }
        return stringBuilder;
    }
}
