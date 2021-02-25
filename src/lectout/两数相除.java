package lectout;

public class 两数相除 {
    public static int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        boolean is=(dividend^divisor)>=0;
        //因为负整数的作用域大于正整数，所以采用负数来运算，最后结果通过 上面的boolean就知道了
        dividend=dividend>0?-dividend:dividend;
        divisor=divisor>0?-divisor:divisor;

        int _divisor=divisor;
        int temp=0;
        int multiple=1;
        while (dividend<=_divisor)
        {
            if(dividend-divisor<=0)
            {
                dividend-=divisor;
                temp+=multiple;
                //通过翻倍来减少运行次数
                divisor+=divisor;
                multiple+=multiple;
            }else {
                divisor=_divisor;
                multiple=1;
            }
        }
        return is?temp:-temp;

    }

    public static void main(String[] args) {
        System.out.println(divide(7,-3));
        System.out.println(Integer.MIN_VALUE);
    }
}
