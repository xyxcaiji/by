package lectout;
/*
组合单词
 */
public class Demo17 {
    public static void main(String[] args) {
        String[] words={"cat","bt","hat","tree"};
        String s="atach";

        System.out.println(pin(words,s));
    }
    public static int pin(String[] words,String s1)
    {
        int length=0;
        //将字符串转为数组存起来
        int[] map=new int[26];
        for(char c:s1.toCharArray())
        {
            map[c-'a']++;
        }
        for(String word:words)
        {
            int[] arr=new int[26];
            for(char c1:word.toCharArray())
            {
                arr[c1-'a']++;
            }
            boolean bo=true;
            for(int i=0;i<word.length();i++)
            {
                //如果不大于 整么这个字符word所有的字符都在所给的字符串里面，可以把这个单词word加上
                if(arr[word.charAt(i)-'a']>map[word.charAt(i)-'a'])
                {
                    bo=false;
                }
            }
            if(bo)
            {
                length+=word.length();
            }
         }
         return length;
    }
}
