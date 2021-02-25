package 携程;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(1,2,3)));
    }
    public static int[] divingBoard(int a,int b,int k)
    {
        if(k==0)
        {
            return null;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<=k;i++)
        {
            set.add(a*i+b*(k-i));
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array);
        int[] answer=new int[array.length];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=array[i];
        }
        return answer;
    }
}
