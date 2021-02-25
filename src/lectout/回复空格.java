package lectout;

import java.util.Arrays;

/**
 * 输入：
 * dictionary = ["looked","just","like","her","brother"]
 * sentence = "jesslookedjustliketimherbrother"
 * 输出： 7
 * 解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/re-space-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 等会看一下背包问题
 */
public class 回复空格 {
    public static void main(String[] args) {
        String[] dictionary={"looked","just","like","her","brother"};
        String sentence="jesslookedjustliketimherbrother";
        System.out.println(respace(dictionary,sentence));
    }
    public static int respace(String[] dictionary, String sentence) {
        int n=sentence.length();
        int m=dictionary.length;
        int[] temp=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            //这一步还是有必要的 ，他是为了后面的可以加上前面的
            temp[i]=temp[i-1];
            for(int j=0;j<m;j++)
            {
                if(i<dictionary[j].length()) continue;
                if(sentence.substring(i-dictionary[j].length(),i).equals(dictionary[j]))
                {
                    temp[i]=Math.max(temp[i-dictionary[j].length()]+dictionary[j].length(),temp[i]);
                }
            }
        }
        System.out.println(Arrays.toString(temp));
        return n-temp[n];
    }
}
