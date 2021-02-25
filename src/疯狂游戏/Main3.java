package 疯狂游戏;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 第一题
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
//        System.out.println(line.substring(1,line.length()-1));
        String substring = line.substring(1, line.length() - 1);
        String[] split = substring.split("\\) \\(");
//        System.out.println(Arrays.toString(split));
        System.out.println(judge(split));

    }
    public static boolean judge(String[] split)
    {
        double x=0L;
        double y=0L;
        double z=0L;
        double[] value=new double[9];
        String[] s1=new String[9];
        int k=0;
        for(int i=0;i<split.length;i++)
        {
            String[] split1 = split[i].split(",");
            for(int j=0;j<split1.length;j++)
            {
                s1[k++]=split1[j];
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            value[i]=Double.parseDouble(s1[i]);
        }
        x=(value[3]-value[0])*(value[3]-value[0])+(value[4]-value[1])*(value[4]-value[1])+(value[5]-value[2])*(value[5]-value[2]);
        y=(value[6]-value[3])*(value[6]-value[3])+(value[7]-value[4])*(value[7]-value[4])+(value[8]-value[5])*(value[8]-value[5]);
        z=(value[0]-value[6])*(value[0]-value[6])+(value[1]-value[7])*(value[1]-value[7])+(value[2]-value[8])*(value[2]-value[8]);
        System.out.println(x+" "+y+" "+z+" ");
        if(x+y>=z)
        {
            return true;
        }
        return false;
    }
}
