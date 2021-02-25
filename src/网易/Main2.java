package 网易;

import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        String[] strings=new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]=scanner.next();
        }
        int[][] nums=new int[n][m];
        for(int i=0;i<strings.length;i++)
        {
            for(int j=0;j<strings[i].length();j++)
            {
                nums[i][j]=Integer.parseInt(strings[i].substring(j,j+1));
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                int i1 = find(nums, i, j);
                if(j==nums[0].length-1)
                {
                    System.out.println(i1);
                    continue;
                }
                System.out.print(i1+" ");
            }
        }
    }
    public static int find(int[][] nums,int i,int j)
    {
        if(nums[i][j]==0) return 0;
        else return 1;
    }
}
