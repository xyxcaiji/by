package 米哈游;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] nums=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                nums[i][j]=scanner.nextInt();
            }
        }
        judge(nums,n,m);
    }
    public static void judge(int[][] nums,int n,int m)
    {
        int[] juLu=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i][j]==1)
                {
                    juLu[j]=1;
                }
            }
        }
        boolean b=true;
        for(int k=0;k<m;k++)
        {
            if(juLu[k]==0)
            {
                b=false;
                break;
            }
        }
        if(b==false)
        {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
