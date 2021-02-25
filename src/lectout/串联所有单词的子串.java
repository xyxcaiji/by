package lectout;
/**
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 *
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：
 *   s = "barfoothefoobarman",
 *   words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 串联所有单词的子串 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words ={"foo","bar"};
        System.out.println(findSubstring(s,words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList();
        int len=words[0].length();
        int wordNum=words.length;
        //map1 存储所有的单词
        HashMap<String,Integer> hashMap1 = new HashMap<String,Integer>();
        for(String ss:words)
        {
            //看原来的map中有没有这个 字符串，有就用原来的value,没有就是默认的0
            Integer orDefault = hashMap1.getOrDefault(ss, 0);
            hashMap1.put(ss,orDefault+1);
        }
        //遍历所有的子串
        for(int i=0;i<s.length()-len*wordNum-1;i++)
        {
            HashMap<String,Integer> hashMap2 = new HashMap<String,Integer>();
            int num=0;
            while (num<wordNum)
            {
                String word = s.substring(i+num*len,i+(num+1)*len);
                //如果word匹配words中的单词，就统计次数
                if(hashMap1.containsKey(word))
                {
                    Integer value=hashMap2.getOrDefault(word,0);
                    hashMap2.put(word,++value);
                    //如果word出现的次数超过words中单词的总数量，则结束统计
                    if(hashMap2.get(word)>hashMap1.get(word))break;
                }else {
                    //如果字符串中出现words中所有单词都不匹配的word则结束统计
                    break;
                }
                num++;
            }
            if(num==wordNum) res.add(i);
        }
        return res;
    }

}
