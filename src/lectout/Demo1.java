package lectout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
无重复字符最长字串
 */
public class Demo1 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        ArrayList arrayList=new ArrayList();

        String s="abcbcdaab";
        int i = lengthOfLong(s);
        System.out.println(i);
    }
    public static int lengthOfLong(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length()==1)
        {
            return 1;
        }
        int maxlength=0;
        //存最长的字符串用的
        List<Character> list=new ArrayList<>();
        //先把第一个字符加进来
        list.add(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            //如果之前加的在里面了 那就证明重复了  那就从i这里再从新开始添加字符 保证不重复
            if(list.contains(s.charAt(i)))
            {
                //找到重读字符所在的索引
                int index=list.indexOf(s.charAt(i));
                //截去重复字符之前的字符，包括重父的
                list= list.subList(index + 1, list.size());
                //再添加上这个重复的字符
                list.add(s.charAt(i));
                System.out.println(i+"----"+list);
                //比较两个谁大选谁
                maxlength=Math.max(maxlength, list.size());
            }else{
                list.add(s.charAt(i));
                maxlength=Math.max(maxlength,list.size());
            }
        }
        return maxlength;
    }
}
