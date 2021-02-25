import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class 网易 {
    public static void main(String[] args) {
        Vector vecto=new Vector();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextLong();
        }
        s.close();
        System.out.println(Arrays.toString(nums));

        System.out.println(find(nums));
    }
    public static long find(long[] nums)
    {
        long min=0L;
        if(nums.length==0)
        {
            return -1;
        }
        long[] mm=new long[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            mm[i]=nums[i+1]-nums[i];
        }
        Arrays.sort(mm);
        //System.out.println(Arrays.toString(mm));
        boolean a=true;
        for(int m=0;m<nums.length-1;m++)
        {
            if(nums[m]!=nums[m+1])
            {
                a=false;
                break;
            }
        }
        if(a) return nums[0];
        boolean b=true;
        min=mm[0];
        for(int j=1;j<mm.length;j++)
        {
            if(mm[j]%min!=0)
            {
                b=false;
                break;
            }
        }
        if(b) return min;
        return -1;
    }
}
