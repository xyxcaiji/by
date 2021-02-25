package lectout;

public class 阶乘 {
    public static int jie(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*jie(n-1);
    }

    public static void main(String[] args) {
        System.out.println(jie(6));
    }
}
