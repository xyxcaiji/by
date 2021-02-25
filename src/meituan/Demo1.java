package meituan;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        int[][] answers=new int[50][2];
        int j=0;
        for(int i=1;i<num/4;i++)
        {
            int temp=i*4;
            StringBuilder sb1=new StringBuilder(String.valueOf(temp));
            if(i==Integer.parseInt(sb1.reverse().toString()))
            {
                count++;
                answers[j][0]=i;
                answers[j][1]=temp;
                j++;
            }
            sb1=null;
            temp=0;
        }
        System.out.println(count);
        for(int i=0;i<j;i++)
        {
            System.out.println(answers[i][0]+" "+answers[i][1]);
        }
    }
}
