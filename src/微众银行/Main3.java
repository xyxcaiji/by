package 微众银行;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                nums[i][j]=scanner.nextInt();
            }
        }
        scanner.close();

//        for(int[] nn:nums)
//        {
//            for(int nnn:nn)
//            {
//                System.out.print(nnn+" ");
//            }
//            System.out.println();
//        }

        System.out.println(findMax(nums));
    }
    public static int findMax(int[][] nums)
    {
        int max=0;
        int step=1;
        for(int i=0;i<nums.length&&step>0;i++)
        {
            if(nums[i][1]!=0)
            {
                max+=nums[i][0];
                nums[i][0]=0;
                step+=nums[i][1];
                step--;
            }
        }
        Arrays.sort(nums,(e1,e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);
        while (step>0)
        {
            for(int i=nums.length-1;i>0&&step>0;i--)
            {
                max+=nums[i][0];
                step-=1;
            }
        }
       return max;
    }
//    public static int findMax(int[][] nums, int step)
//    {
//        int max=0;
//        List<Integer> lists=new ArrayList<>();
//        while (step>0)
//        {
//            int temp=0;
//            int value=0;
//            for(int i=0;i<nums.length;i++)
//            {
//                if(lists.contains(i)) continue;
//                if(temp<nums[i][1])
//                {
//                    temp=nums[i][1];
//                    value=nums[i][0];
//                }
//                temp=Math.max(nums[i][1],temp);
//                if(temp==0)
//                {
//                    for(int j=0;j<nums.length;j++)
//                    {
//                        if(lists.contains(j)) continue;
//                        value=Math.max(nums[j][0],value);
//                    }
//                }
//                lists.add(i);
//                temp=0;
//                value=0;
//            }
//            step+=temp;
//            max+=value;
//            step-=1;
//        }
//        return max;
//    }
}
