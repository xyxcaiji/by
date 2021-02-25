package main.顺丰;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {

    }
    public static int longestValidParentheses(String s) {
        int n = s.length();
        if (n == 0) return 0;

        Stack<Integer> stk = new Stack<>();
        int res = 0;
        char[] charS = s.toCharArray();
        stk.push(-1);
        for (int i = 0; i < n; i++) {
            if (charS[i] == '(')
                stk.push(i);
            else {
                stk.pop();
                if (stk.isEmpty()) {
                    stk.push(i);
                } else {
                    res = Math.max(res, i - stk.peek());
                }
            }
        }
        return res;
    }
}
