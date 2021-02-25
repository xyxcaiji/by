package 贝壳;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3
 * 1 2 3
 * 1
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextLong();
        }
        System.out.println(find(nums,n));


    }
    public static int find(long[] nums,int n)
    {
        //Arrays.sort(nums);
        long max=nums[0];
        for(int i=1;i<n;i++)
        {
            max=nums[i]|max;
        }
        //System.out.println(max);
        ArrayList<Integer> list=new ArrayList<>();
        int lenCha=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            long temp=nums[i];
            for(int j=i;j<n;j++)
            {
                temp=temp|nums[j];
                if(temp==max)
                {
                    //(nums[j]-nums[i])+1;
                    //lenCha=Math.min((nums[j]-nums[i])+1,lenCha);
                    list.add(j-i+1);
                    break;
                }
            }
        }
        for(int i=0;i<list.size();i++)
        {
            lenCha=Math.min(list.get(i),lenCha);
        }
        //System.out.println(list);
        return lenCha;
    }
}
