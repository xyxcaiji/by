package lectout;

public class 台阶问题 {
    public static int taiJie(int n)
    {
        if(n<=1)
        {
            return 1;
        }else if(n==2)
        {
            return 2;
        }
        return taiJie(n-1)+taiJie(n-2);
    }

    public static void main(String[] args) {
        System.out.println(taiJie(10));
    }
}
