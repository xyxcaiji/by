package 绿湾;

import java.util.Scanner;
import java.util.Stack;
class Main1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        MyQueue queue = new MyQueue();
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if(s.contains("push")){
                char[] chars = s.toCharArray();
                for(int i=0;i<chars.length;i++){
                    if(chars[i]>='0'&&chars[i]<='9'){
                        int n=chars[i]-'0';
                        queue.push(n);
                    }
                }
            }else if(s.contains("peek")){
                System.out.println(queue.peek());
            }else if(s.contains("pop")){
                System.out.println(queue.pop());
            }else if(s.contains("empty")){
                System.out.println(queue.empty());
            }
        }
    }
    static class MyQueue {
        Stack<Integer> t1=null;
        Stack<Integer> t2=null;
        public MyQueue(){
            t1=new Stack<>();
            t2=new Stack<>();
        }
        public void push(int x){
            if(t2.empty()){
                t1.push(x);
            }else {
                while (!t2.empty()){
                    t1.push(t2.pop());
                }
                t1.push(x);
            }
        }
        public int pop(){
            while (!t1.empty()){
                t2.push(t1.pop());
            }
            return t2.pop();
        }
        public int peek(){
            while (!t1.empty()){
                t2.push(t1.pop());
            }
            return t2.peek();
        }
        public boolean empty(){
            return t2.size()>t1.size()?t2.empty():t1.empty();
        }

    }

}
