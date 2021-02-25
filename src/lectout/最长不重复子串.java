package lectout;

import java.util.HashSet;

public class 最长不重复子串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int r=0,l=0;
        int max = 0;
        for(;r<s.length();r++){
            char c = s.charAt(r);
            while (set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
