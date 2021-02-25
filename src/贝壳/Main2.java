package 贝壳;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++)
        {
            nums[i][0]=scanner.nextInt();
            nums[i][1]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(find(nums[i][0],nums[i][1]));
        }
    }
    public static int find(int n,int m)
    {
        if(n%2!=0&&m%2!=0)
        {
            if(ciFang(n)==n&&ciFang(m)==m)
            {
                return m>n?m:n;
            }
            return Math.min(ciFang(n),ciFang(m));
        }
        else return 2;
    }
    public static int ciFang(int n)
    {
        int temp=0;
        for(int i=1;i<n/2;i++)
        {
            if(i*i==n)
            {
                temp=i;
            }
        }
        return temp>0?temp:n;
    }
}
