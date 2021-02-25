import java.util.Queue;

public class Queeu8 {

    int max=9;
    int [] array=new int[max];
    static int count=0;
    public static void main(String[] args) {
        //测试，8皇后是否正确
        Queeu8 queeu8 = new Queeu8();
        queeu8.check(0);
        System.out.println();

        System.out.println("有多少种"+count);
    }
    //编写一个方法，防止第n个皇后
    private void check(int n)
    {
        if(n==max)
        {
            print();
            return;
        }
        //依次放入皇后并且判断是否冲突
        for(int i=0;i<max;i++)
        {
            //先把传进来的皇后，放到该行的第一列，然后判断
            array[n]=i;
            //判断当前放的皇后位置是否与以前冲图
            if(judge(n)){//如果不冲突
                //继续放n+1个皇后，开始递归
                check(n+1);
            }
            //如果冲突，就继续执行for循环，将第n个皇后的位置后移
        }
    }

    //查看当我们放置第n+1个皇后，检测该皇后知否和前面摆放的皇后是否冲突
    private boolean judge(int n)
    {
        for(int i=0;i<n;i++)
        {
            //第一个条件是判断是否为一列
            //第二个条件  math.abs()得到n-i的距离  如果列距==行距 也就是斜率为1，那么就在同一斜线上就不行
            if(array[i]==array[n] || Math.abs(n-i)==Math.abs(array[n]-array[i]))
            {
                return false;
            }
        }
        return true;
    }

    //写一个方法，姜皇后拜访的位置输出
    private void print()
    {
        count++;
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
