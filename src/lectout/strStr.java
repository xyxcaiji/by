package lectout;

public class strStr {
    public static int str(String haystack,String needle)
    {
        if(needle.length()==0||needle.equals(" "))
        {
            return 0;
        }
        char[] chars=haystack.toCharArray();
        char[] c=needle.toCharArray();
        if(c.length==chars.length&&haystack.contains(needle)) return 0;
        int temp=0;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==c[0])
            {
                temp=i+1;
                boolean b=true;
                for(int j=1;j<c.length;j++)
                {
                    if(chars[temp++]!=c[j]){
                        b=false;
                        break;
                    }
                }
                if(b) return i;
                else{
                    temp=0;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(str("hello"," "));
        String s="hello";
        String s2="ll";
        System.out.println(s.indexOf(s2));
    }
}
