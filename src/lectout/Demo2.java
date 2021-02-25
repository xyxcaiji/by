package lectout;

import java.security.interfaces.RSAKey;

/*
    整数反转

    例子：输入123
    输出321
 */
public class Demo2 {
    public static void main(String[] args) {
        int reserve = reserve(123);
        System.out.println(reserve);
    }
    public static int reserve(int n)
    {
        long rs=0;
        while (n!=0)
        {
            rs=rs*10+n%10;
            n=n/10;
            System.out.println(rs);
        }
        if((int)rs!=rs)
        {
            return 0;
        }
        else{
            return (int)rs;
        }

    }
}
