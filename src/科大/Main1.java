package 科大;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] values={1,5,10,50,100};
        int[] nums=new int[5];
        for(int i=0;i<5;i++)
        {
            nums[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        System.out.println(find(values,nums,target));
    }
    public static int find(int[] values,int[] nums,int target)
    {
        int answer=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            while (nums[i]>0)
            {
                if(values[i]<=target)
                {
                    target-=values[i];
                    --nums[i];
                    answer+=1;
                }else {
                    break;
                }
                //System.out.println(target);
            }
        }
        if(target!=0) return -1;
        return answer;
    }
}
