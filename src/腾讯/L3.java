package 腾讯;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] line = new int[n];
        for(int i=0;i<n;i++)
        {
            line[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            int temp=line[i];
            line[i]=Integer.MIN_VALUE;
            //System.out.println(Arrays.toString(line));
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++)
            {
                set.add(line[j]);
            }
//            System.out.println(set);
            Integer[] tss=new Integer[set.size()];
            Integer[] integers = set.toArray(tss);
            //System.out.println(Arrays.toString(integers));
            Arrays.sort(integers);
            System.out.println(integers[set.size()/2]);
            line[i]=temp;
            //System.out.println(Arrays.toString(line));
        }
    }
}
