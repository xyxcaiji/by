package lectout;

/**
 * 不行，官方数学讲的太复杂了.....抛开k =0和shorter=longer这两种情况,
 *
 * 最短: shorter * k
 * 第二短: shorter * k + (longer - shorter) * 1
 * 第三短: shorter * k + (longer - shorter) * 2
 *
 * 最长:shorter * k + (longer - shorter) * k
 * 结束
 */
public class 跳水版 {
    public static void main(String[] args) {

    }
    public static int[] divingBoard(int shorter, int longer, int k) {
        if(k==0) return new int[]{};
        if(shorter==longer) return new int[]{shorter*k};
        int[] result=new int[k+1];
        for(int i=0;i<result.length;i++)
        {
            result[i]=shorter*k+(longer-shorter)*i;
        }
        return result;
    }
}
