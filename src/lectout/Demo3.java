package lectout;
/*
将数组分为三个相等的部分
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] num={0,2,1,-6,6,7,9,-1,2,0,1};
        boolean test = test(num);
        System.out.println(test);
    }
    public static boolean test(int[] n)
    {
        int temp=0,eq=0;
        if(n.length==0)
        {
            return false;
        }
        int count=0;
        for(int i=0;i<n.length;i++)
        {
            count+=n[i];
        }
        count=count/3;
        if(count%3!=0)
        {
            return false;
        }
        for(int j=0;j<n.length;j++)
        {
            temp+=n[j];
            if(count==temp)
            {
                eq++;
                if(eq==2)
                {
                    return true;
                }
                temp=0;
            }
        }
        return false;
    }
}
