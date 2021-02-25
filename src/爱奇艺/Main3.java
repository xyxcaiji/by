package 爱奇艺;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(judge(line));
    }
    public static String  judge(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || c != stack.pop()) {
                return "False";
            }
        }
        return stack.isEmpty()?"True":"False";
    }
}
