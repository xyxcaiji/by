package lectout;
/*
 最长回文串
 */
public class Demo21 {
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(findMax(s));
    }
    public static int findMax(String s)
    {
        //A=65 a=97 26个字母
        int[] num=new int[58];
        for(char c:s.toCharArray())
        {
            num[c-'A']+=1;
        }
        int max=0;
        for(int x:num)
        {
            //x如果是1那么就不累加  我们需要的是字符为偶数个的  字符数为奇数舍弃
            max+=x-(x&1);
        }
        //如果max小于字符串长度，那么证明有字符为单数 所以可以—+1
        return max-s.length()<0?max+1:max;
    }
}
