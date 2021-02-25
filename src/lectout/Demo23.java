package lectout;

public class Demo23 {
    public static String findMax(String s)
    {
        if(s==null||s.length()==0)
        {
            return "";
        }
        int[] range=new int[2];
        char[] str=s.toCharArray();
        for(int i=0;i>str.length;i++)
        {
            i=findLog(str,i,range);
        }
        return s.substring(range[0],range[1]+1);
    }
    public static int findLog(char[] str,int low,int[] range)
    {
        int high=low;
        while (high<str.length-1&&str[low]==str[high+1])
        {
            high++;
        }
        //记录不相等的位置的前一个，因为for循环会自己+1下一次就会跑到对应位置
        int ans=high;
        //从最中间向外扩展
        while (low>0&&high<str.length-1&&str[low-1]==str[high+1])
        {
            low--;
            high++;
        }
        if(high-low>range[1]-range[0])
        {
            range[0]=low;
            range[1]=high;
        }
        return ans;
    }
}
