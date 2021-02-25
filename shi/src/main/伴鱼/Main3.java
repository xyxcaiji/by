package main.伴鱼;

import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(minInsertions("))))()"));
    }
    public static int minInsertions(String s){
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1&&s.equals(")")){
            return 2;
        }
        int temp=0;
        char[] chars = s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                stack.push(')');
                stack.push(')');
            }else {
                if(stack.empty()){
                    if(i==chars.length-1){
                        temp+=2;
                        continue;
                    }
                    if(chars[i]==chars[i+1]){
                        temp+=1;
                        i++;
                        continue;
                    }else {
                        temp+=2;
                        continue;
                    }
                }
                stack.pop();
            }
        }
        if(stack.empty()&&temp==0){
            return 0;
        }else {
            return stack.size()+temp;
        }
    }
}
