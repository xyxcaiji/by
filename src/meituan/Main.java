package meituan;

import java.util.Scanner;
public class Main {
    //static int result=0;
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
        String[][] chars={{".",".","x",".","x"},{"x","x",".",".","."}};
        int result=0;
        int i = find(chars, 0, 0,result);
        System.out.println(i);
    }
    public static int find(String[][] strings,int i,int j,int result)
    {
        if(i<0||j<0||j>=strings.length||i>=2)
        {
            return -1;
        }

        if(strings[i][j+1].equals("."))
        {
            find(strings,i,j+1,result);
        }
        if(i-1>0&&strings[i-1][j+1].equals("."))
        {
            find(strings,i-1,j+1,result);
        }
        if(strings[i+1][j+1].equals("."))
        {
            find(strings,i+1,j+1,result);
        }
        if(j==4&&i==1)
        {
            return ++result;
        }
        return result;
    }
}
/*

 */
/*
9113
 public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int l=scanner.nextInt();
        int r=scanner.nextInt();
        int temp=0;
        int result=1;
        if(l<r)
        {
            System.out.println("错误");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=l;j<=r;j++)
            {
                if(j%k==0)
                {
                    temp++;
                }
            }
            result=result*temp;
            temp=0;
        }
        System.out.println(result);
    }
 */