package 疯狂游戏;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] value=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            value[i]=Integer.parseInt(s1[i]);
        }
        System.out.println(zhi(value));
    }
    public static int zhi(int[] value)
    {
        int x=0;
        int y=0;
        int z=0;
        x=value[2]+value[1]+value[0];
        y=value[3]+value[4]+value[5];
        z=value[6]+value[7]+value[8];
        if(x==0)
        {
            return (value[9]-value[0])*(value[9]-value[0])+(value[10]-value[1])*(value[10]-value[1])+(value[11]-value[2])*(value[11]-value[2]);
        }
        if (y==0)
        {
            return (value[9]-value[3])*(value[9]-value[3])+(value[10]-value[4])*(value[10]-value[4])+(value[11]-value[5])*(value[11]-value[5]);
        }
        return (value[9]-value[6])*(value[9]-value[6])+(value[10]-value[7])*(value[10]-value[7])+(value[11]-value[8])*(value[11]-value[8]);
    }
}
