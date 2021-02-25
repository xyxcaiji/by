package qianxin;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        boolean empty = stack.empty();
        Object peek = stack.peek();
        Object pop = stack.pop();
        int search = stack.search(2);
        System.out.println("search"+search);
        System.out.println("stack.pop"+pop);
        System.out.println("stack.peek"+peek);
        System.out.println(empty);
    }
}
