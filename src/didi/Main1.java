package didi;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        find(n);
    }
    public static void find(int n)
    {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                for(int k=0;k<=9;k++)
                {
                    int t1=i*100+j*10+k;
                    int t2=i*100+k*10+k;
                    if(t1+t2==n)
                    {
                        count++;
                        list.add(t1);
                        list.add(t2);
                    }
                }
            }
        }
        if(count==0)
        {
            System.out.println(0);
        }else {
            System.out.println(count);
            for(int i=0;i<list.size();i++)
            {
                if(i%2==0)
                System.out.print(list.get(i)+" ");
                else{
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
