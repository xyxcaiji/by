package lectout;
/*
压缩字符串
 */
public class Demo15 {
    public static void main(String[] args) {
        String s1="aabcccccaaa";

        System.out.println(ya(s1));
    }
    public static String ya(String s1)
    {
        if(s1==null||s1.length()==0)
        {
            return null;
        }
        StringBuilder stringBuilder=new StringBuilder();
        char pre=s1.charAt(0);
        int temp=1;
        for(int i=1;i<s1.length();i++)
        {
            char c1 = s1.charAt(i);
            if(c1==pre)
            {
                temp++;
            }else{
                stringBuilder.append(pre).append(temp);
                pre=c1;
                temp=1;
            }
        }
        stringBuilder.append(pre).append(temp);
        if(stringBuilder.length()>=s1.length())
        {
            return s1;
        }
        return stringBuilder.toString();
    }
}
