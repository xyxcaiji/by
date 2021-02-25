package 快手;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        int[] nums=new int[s.length];
        for(int num:nums)
        {
            for(int i=0;i<s.length;i++)
            {
                nums[i]=Integer.valueOf(s[i]);
            }
        }
//        System.out.println(Arrays.toString(s));
//        find(nums);
        System.out.println(find(nums));
    }
    public static StringBuilder find(int[] nums)
    {
        StringBuilder stringBuilder=new StringBuilder();
        if(nums==null||nums.length==0)
        {
            return stringBuilder.append(-1);
        }
        for(int i=1;i<nums.length;i++)
        {
            int temp=0;
            int j=i-1;
            while (j>0)
            {
                if(nums[j]>nums[i])
                {
                    temp+=1;
                }
                j--;
            }
            if(temp==1)
            {
                stringBuilder.append(i+" ");
            }
            temp=0;
        }
        if(stringBuilder.length()==0)
        {
            return stringBuilder.append(-1);
        }
        return stringBuilder;
    }
}
