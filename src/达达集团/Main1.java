package 达达集团;

import java.time.Year;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m = scanner.nextInt();
        int[] nums=new int[m];
        for(int i=0;i<m;i++)
        {
            nums[i]=scanner.nextInt();
        }
        scanner.close();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==4)
            {
                System.out.println("4 1 3 2");
            }
            else if(nums[i]==3)
            {
                System.out.println("2 1 3");
            }else if(nums[i]==2)
            {
                System.out.println("2 1");
            }else if(nums[i]==1)
            {
                System.out.println("1");
            }else {
                int[] temp=new int[nums[i]];
                int j=1;
                int t=1;
                int k=0;
                while (t<=nums[i])
                {
                    if(j==2&&k==1)
                    {
                        j+=2;
                        continue;
                    }
                    temp[j]=t++;
                    if(j+2>temp.length-1)
                    {
                        k++;
                        if(k==1)
                        {
                            j=0;
                            continue;
                        }
                        j=k;
                    }else {
                        j+=2;
                    }
                }
                for(int n=0;n<temp.length;n++)
                {
                    System.out.print(temp[n]+" ");
                }
                System.out.println();
            }

        }
    }
}
