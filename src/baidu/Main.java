package baidu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=i+1;
        }
      //  System.out.println(Arrays.toString(nums));
        System.out.println(findMax(nums,n));
    }
    public static int findMax(int[] nums,int m)
    {
//        int i=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            while (i<m-1)
            {
                int lcm=lcm(nums[i],nums[i+1]);
                int gcd=gcd(nums[i],nums[i+1]);
                max=Math.max(lcm-gcd,max);
                i++;
            }
        }

//
//        int max=0;
//       for(int i=0;i<nums.length;i++)
//       {
//           for(int j=i;j<nums.length-1;j++)
//           {
//               if(i==j) continue;
//               int lcm=lcm(nums[i],nums[i+1]);
//               int gcd=gcd(nums[i],nums[i+1]);
//             //  System.out.println(max);
//               max=Math.max(lcm-gcd,max);
//           }
//       }
       return max;
    }
    public static int lcm(int a,int b)
    {
        int max=a>b?a:b;
        for(int i=max;;i++)
        {
            if((i%a==0)&&(i%b==0))
            {
                return i;
            }
        }
    }
    public static int gcd(int a,int b)
    {
        int max=0;
       while (b!=0)
       {
           max=a%b;
           a=b;
           b=max;
       }
        return a;
    }
}
