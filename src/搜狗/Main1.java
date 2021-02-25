package 搜狗;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(findMax(1,1,10));
    }
    public static int findMax(int a,int b,int c)
    {
        int[] temp={a,b,c};
        Arrays.sort(temp);
        while (temp[1]<temp[2])
        {
            temp[0]++;
            temp[2]-=2;
            Arrays.sort(temp);
        }
        return (temp[0]+temp[1]+temp[2]-1)/3;
    }
}
