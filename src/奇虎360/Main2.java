package 奇虎360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int[] move=new int[m];
        for(int i=0;i<m;i++)
        {
            move[i]=scanner.nextInt();
        }
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        int a=1;
        int b=1;
        paiXu(move,m,n,nums,a,b);
    }
    public static void paiXu(int[] move,int m,int n,int[] nums,int a,int b)
    {
        for(int j=0;j<m;)
        {
            if(move[j]==1)
            {
                int judge = judge(move, j, 1, nums);
                nums=f1(nums,n,judge);
                j+=judge;
            }
            if(move[j]==2)
            {
                j+=2;
                continue;
            }
            //System.out.println(Arrays.toString(nums));
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] f1(int[] nums,int n,int judge)
    {
        int temp=nums[0];
        //nums=Arrays.copyOfRange(nums,1,n-1);
        for(int t=0;t<n-1;t++)
        {
            nums[t]=nums[t+1];
        }
        nums[n-1]=temp;
        return nums;
    }
    public static int[] f2(int[] nums,int n)
    {
        for(int k=0;k<n;k+=2)
        {
            int temp=nums[k+1];
            nums[k+1]=nums[k];
            nums[k]=temp;
        }
        return nums;
    }
    public static int judge(int[] move,int j,int value,int[] nums)
    {
        int temp=0;
        for(;j<move.length;j++)
        {
            if(move[j]==value)
            {
                temp++;
            }else {
                break;
            }
        }
        return temp;
    }
}
