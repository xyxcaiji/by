package 携程;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  不应该 匹配字符串
 *  而应该 是把他们的字符个数 记下来 然后 进行比对，如果 差值 <=2 就证明可以 然后输出对应的  字符串
 *
 *  哎呀，咋考完了 才想出来答案
 *  气死我了
 *
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String world = scanner.next();
        scanner.close();
        System.out.println(jiuZheng(world));
    }
    public static String jiuZheng(String world)
    {
        int temp=0;
        String[] strings={ "surprise", "happy", "ctrip", "travel", "wellcome","student","system","program","editor"};
        // A=65 a=97 26个字母
        int[] num=new int[58];
        for(char c:world.toCharArray())
        {
            num[c-'A']+=1;
        }
        int[][] numss=new int[strings.length][58];
        for(int n=0;n<strings.length;n++)
        {
            for(char c:strings[n].toCharArray())
            {
                numss[n][c-'A']+=1;
            }
        }
       // System.out.println(Arrays.toString(numss));
        for(int i=0;i<numss.length;i++)
        {
            for(int j=0;j<numss[i].length;j++)
            {
               if(num[j]-numss[i][j]<0)
               {
                   temp+=1;
               }
               if(temp>2)
               {
                   break;
               }
            }
            if(temp<=2)
            {
                return strings[i];
            }
            temp=0;
        }
        return "null";
//        for(int i=0;i<strings.length;i++)
//        {
//            if(world.length()+1==strings[i].length()||world.length()-1==strings[i].length())
//            {
//                for(int j=0;j<world.length();j++)
//                {
//                    if(world.charAt(j)!=strings[i].charAt(j)||world.charAt(j)!=strings[i].charAt(j+1))
//                    {
//                        temp+=1;
//                        if(temp>1)
//                        {
//                            break;
//                        }
//                    }
//                }
//                if(temp==1||temp==0)
//                {
//                    strp=i;
//                }
//                temp=0;
//            }
//
//        }
//        if(strp==-1)
//        {
//            return "null";
//        }
//       if(temp<=1)
//       {
//           return strings[strp];
//       }

    }
}
