package meituan;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] strs=new String[n][2];
        for(int i=0;i<n;i++)
        {
            strs[i][0]=scanner.next();
            strs[i][1]=scanner.next();
        }
        scanner.close();
        System.out.println(find(strs,n));
    }
    public static int find(String[][] strs,int n)
    {
        int count=0;
        //int[] ji=new int[n];
        String start=strs[0][0];
        for(int i=0;i<n;i++)
        {
            if(start==null)
            {
                start=strs[i][0];
            }
            if(strs[i][1].equals(start))
            {
                count++;
                start=null;
            }
            //System.out.println(count);
        }
        return count;
    }
}
