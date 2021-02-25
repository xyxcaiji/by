package kaoshi;

import Demo.Lis;
/*
3
1 2 1 0
1 3 2 0
2 3 4 0
 */
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] erWei=new int[n][4];
        for(int i=0;i<erWei.length;i++)
        {
            for(int j=0;j<4;j++)
            {
                erWei[i][j]=scanner.nextInt();
            }
        }
        int min = findMin(erWei, n);
        System.out.println(min);
    }
    public static int findMin(int[][] erWei,int n)
    {
        int temp=0;
        int[] min=new int[n-1];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(erWei[i][3]==0&&erWei[i+1][3]==0)
            {
                temp=erWei[i][2]+erWei[i+1][2];
                min[j++]=temp;
            }
        }
        int maxMin=min[0];
        for(int m=1;m<min.length;m++)
        {
            if(min[m]<maxMin)
            {
                maxMin=min[m];
            }
        }
        return maxMin;
    }
}
/*
路由器切换
 */
//public class Main {
//
//}
