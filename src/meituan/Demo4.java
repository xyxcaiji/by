package meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] strs=new int[n][2];
        for(int i=0;i<n;i++)
        {
            strs[i][0]=scanner.nextInt();
            strs[i][1]=scanner.nextInt();
        }
        scanner.close();

        int max=Math.max(maxValue(strs,a,b,n),maxValue2(strs,a,b,n));
        System.out.println(max);
    }
    public static int maxValue(int[][] moneys,int a,int b,int n)
    {
        int[] goA=new int[a];
        int[] goB=new int[b];
        a--;
        b--;
        for(int i=0;i<n;i++)
        {
            if(moneys[i][0]>moneys[i][1]) {
                if (a < 0) {
                    Arrays.sort(goA);
                    if (moneys[i][0] > goA[0]) {
                        goA[0] = moneys[i][0];
                    }
                    continue;
                }
                goA[a] = moneys[i][0];
                a--;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<goA.length;i++)
        {
            list.add(goA[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!list.contains(moneys[i][0]))
            {
                    if (b < 0) {
                        Arrays.sort(goB);
                        if (moneys[i][1] > goB[0]) {
                            goB[0] = moneys[i][1];
                        }
                        continue;
                    }
                    goB[b] = moneys[i][1];
                    b--;

            }

        }
        int count=0;
        for(int i=0;i<goA.length;i++)
        {
           count+=goA[i];
        }
        for(int i=0;i<goB.length;i++)
        {
            count+=goB[i];
        }
        return count;
    }
    public static int maxValue2(int[][] moneys,int a,int b,int n)
    {
        int[] goA=new int[a];
        int[] goB=new int[b];
        a--;
        b--;
        for(int i=0;i<n;i++)
        {
            if(moneys[i][0]<moneys[i][1]) {
                if (b < 0) {
                    Arrays.sort(goB);
                    if (moneys[i][1] > goB[0]) {
                        goB[0] = moneys[i][1];
                    }
                    continue;
                }
                goB[b] = moneys[i][1];
                b--;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<goB.length;i++)
        {
            list.add(goB[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!list.contains(moneys[i][1]))
            {
                if (a < 0) {
                    Arrays.sort(goA);
                    if (moneys[i][0] > goA[0]) {
                        goA[0] = moneys[i][0];
                    }
                    continue;
                }
                goA[a] = moneys[i][0];
                a--;

            }

        }
        int count=0;
        for(int i=0;i<goA.length;i++)
        {
            count+=goA[i];
        }
        for(int i=0;i<goB.length;i++)
        {
            count+=goB[i];
        }
        return count;
    }
}
