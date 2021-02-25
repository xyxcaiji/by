package 疯狂游戏;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(",");
        System.out.println(find(split));
    }
    public static int find(String[] str)
    {
        int[] nums=new int[str.length];
        for(int i=0;i<str.length;i++) nums[i]=Integer.parseInt(str[i]);
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for(int i=0;i<nums.length/2;i++)
        {
            stack1.push(nums[i]);
            stack2.push(nums[nums.length-i-1]);
        }
        int result=0;
        int temp=0;
        int k=0;
        if(nums.length%2==0)
        {
            temp=stack1.peek()>stack2.peek()?stack2.peek():stack1.peek();
            if(temp==stack1.peek())
            {
                k=2;
                stack1.pop();
            }else {
                k=1;
                stack2.pop();
            }
        }else {
            temp=nums[nums.length/2];
        }
        while (stack1.size()>0&&stack2.size()>0)
        {
            result+=stack1.peek()*stack2.peek()*temp;
            if(stack1.size()==1&&stack2.size()==1)
            {
                result+=stack1.peek()*stack2.peek();
                result+=Math.max(stack1.peek(),stack2.peek());
                break;
            }
            if(k==1)
            {
                temp=stack1.pop();
                k=2;
            }else {
                temp=stack2.pop();
                k=1;
            }
        }
        return result;
    }
}
