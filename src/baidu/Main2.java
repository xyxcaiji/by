package baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int m1= scanner.nextInt();
            int[][] ints = new int[m1][2];
            for(int i=0;i<m1;i++)
            {
                ints[i][0] = scanner.nextInt();
                ints[i][1] = scanner.nextInt();
            }
            int m2= scanner.nextInt();
            int[][] ints2 = new int[m2][2];
            for(int i=0;i<m2;i++)
            {
                ints2[i][0] = scanner.nextInt();
                ints2[i][1] = scanner.nextInt();
            }
            int[] temp=new int[n+1];
            for(int i=0;i<ints.length;i++)
            {
                for(int j=ints[i][0];j<=ints[i][1];j++)
                {
                    temp[j]+=1;
                }
            }
            //System.out.println(Arrays.toString(temp));
            for(int i=0;i<ints2.length;i++)
            {
                for(int j=ints2[i][0];j<=ints2[i][1];j++)
                {
                    temp[j]+=2;

                }
            }
            int answer=0;
            StringBuilder sb1=new StringBuilder();
            for(int k=0;k<n;k++)
            {
                if(temp[k]==3)
                {
                    answer++;
                    temp[k]=k;
                }else {
                    temp[k]=0;
                }
            }
            for(int k=0;k<n;k++)
            {
                if(temp[k]!=0)
                {
                    sb1.append(temp[k]+" ");
                }
            }
            System.out.println(answer);
            System.out.println(sb1.toString());
            ints=null;
            ints2=null;
            t--;
        }

    }
}
