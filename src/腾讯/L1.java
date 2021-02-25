package 腾讯;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set1.add(scanner.nextInt());
        }
        int m=scanner.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            set.add(scanner.nextInt());
        }
        set1.addAll(set);
        Integer[] temp=new Integer[set1.size()];
        Integer[] integers = set1.toArray(temp);
        Arrays.sort(integers);
        for(int i=integers.length-1;i>0;i--)
        {
            System.out.print(integers[i]+" ");
        }

    }
}
