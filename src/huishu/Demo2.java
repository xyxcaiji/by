package huishu;

import java.util.jar.Attributes;

/*
八皇后
 */
public class Demo2 {
    static int max=8;
    static int [] array=new int[max];
    static int count=0;
    public static void main(String[] args) {
        check(0);
        System.out.println(count);
    }
    //放置皇后
    public static void check(int n)
    {
        if(n==max)
        {
            //输出
            prin();
            return;
        }
        for(int i=0;i<max;i++)
        {
            array[n]=i;
            if(can(n))
            {
                check(n+1);
            }
        }
    }

    //判断第n+1个皇后插进来能不能插入
    public static boolean can(int n)
    {
        for(int i=0;i<n;i++)
        {
            //如果列距离==行距离 就证明他们的斜率是一样的  所以不可以
            if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i]))
            {
                return false;
            }
        }
        return true;
    }
    public static void prin()
    {
        count++;
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
