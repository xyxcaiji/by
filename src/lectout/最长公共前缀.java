package lectout;

public class 最长公共前缀 {
    public static void main(String[] args) {
        String[] s1={"flower","flow","flight"};
        System.out.println(gong(s1));
    }
    public static String gong(String[] s1)
    {
        StringBuilder sb=new StringBuilder();
        if(s1.length==0)
        {
            return "";
        }
        for(int i=0;i<s1[0].length();i++)
        {
            char c = s1[0].charAt(i);
            for(int j=0;j<s1.length;j++)
            {
                if(i>=s1[j].length()||s1[j].charAt(i)!=c)
                {
                   return sb.equals(null)?"":sb.toString();
                }
            }
            sb.append(s1[0].charAt(i));
        }
        return sb.toString();
    }
}
