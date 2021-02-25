package lectout;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
两个数组合并 找中位数
 */
public class Demo4 {
    public static double heBing(int[] n1,int[] n2)
    {
        int i=0;
        int[] count=new int[n1.length+n2.length];
        while (n1.length>0&&n2.length>0)
        {
            if(n1[0]<n2[0])
            {
                count[i++]=n1[0];
                n1= Arrays.copyOfRange(n1,1,n1.length);
            }else{
                count[i++]=n2[0];
                n2= Arrays.copyOfRange(n1,1,n2.length);
            }
        }
        while (n1.length>0)
        {
            count[i++]=n1[0];
            n1= Arrays.copyOfRange(n1,1,n1.length);
        }
        while(n2.length>0)
        {
            count[i++]=n2[0];
            n2= Arrays.copyOfRange(n2,1,n2.length);
        }
        System.out.println(Arrays.toString(count));
        if(count.length%2==0)
        {
            int middle=count.length/2;
            return (count[middle]+count[middle-1])/2;
        }
        double floor = Math.floor(count.length / 2);
        return count[(int) floor];
    }

    public static void main(String[] args) {
        int[] n1={1,2};
        int[] n2={3,4};
        double v = heBing(n1, n2);
        System.out.println(v);
        Pattern pattern=Pattern.compile("[a-z]{3}");
        Matcher matcher = pattern.matcher("abc");
        System.out.println(matcher.find());
    }
}
