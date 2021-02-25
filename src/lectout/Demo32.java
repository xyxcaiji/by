package lectout;

import Demo.Lis;
/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Demo32 {
    public static void main(String[] args) {
        String s="234";
        List all = findAll(s);
        System.out.println(all);
    }
    public static List findAll(String nums)
    {
        String[] strings=new String[nums.length()];
        for(int i=0;i<nums.length();i++)
        {
            switch (nums.charAt(i))
            {
                case '2':strings[i]="abc";break;
                case '3':strings[i]="def";break;
                case '4':strings[i]="ghi";break;
                case '5':strings[i]="jkl";break;
                case '6':strings[i]="mno";break;
                case '7':strings[i]="pqrs";break;
                case '8':strings[i]="tuv";break;
                case '9':strings[i]="wxyz";break;
            }
        }
        List<String> length=new ArrayList<>();
        find(length,strings,"",0);
        return length;
    }
    public static void find(List list,String[] strings,String temp,int i)
    {
        if(i<strings.length-1)
        {
            for(int j=0;j<strings[i].length();j++)
            {
                find(list,strings,temp+strings[i].charAt(j),i+1);
            }
        }else{
            for(int j=0;j<strings[i].length();j++)
            {
                list.add(temp+strings[i].charAt(j));
            }
        }
    }
}
