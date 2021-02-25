package 腾讯;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        String nextInt = scanner.nextLine();
        for(int i=0;i<Integer.parseInt(nextInt);i++)
        {
            String s=scanner.nextLine();
            judge(queue,s);
        }
    }
    public static void judge(Queue<Integer> queue,String s)
    {
        String[] s1 = s.split(" ");
        if(s1.length==1)
        {
            if(s1[0].equals("peek"))
            {
                System.out.println(queue.peek());
            }else  if(s1[0].equals("poll"))
            {
                queue.poll();
            }else {

            }
        }else {
            queue.add(Integer.parseInt(s1[1]));
        }
    }

}
