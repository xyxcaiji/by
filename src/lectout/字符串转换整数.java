package lectout;

public class 字符串转换整数 {
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(Solution(s));
    }
    static int Solution(String str ){
        char[] chars = str.toCharArray();
        int n=chars.length;
        int idx=0;
        while (idx<n&&chars[idx]==' ') idx++;
        if(idx==n) return 0;
        boolean neggative=true;
        if(chars[idx]=='-')
        {
            neggative=false;
            idx++;
        }else if(chars[idx]=='+')
        {
            idx++;
        }else if(!Character.isDigit(chars[idx]))
        {
            return 0;
        }
        int ans=0;
        while (idx<n&&Character.isDigit(chars[idx]))
        {
            int digit=chars[idx]-'0';
            if(ans>(Integer.MAX_VALUE-digit)/10)
            {
                return neggative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans=ans*10+digit;
            idx++;
        }
        return neggative?ans:-ans;
    }
}
