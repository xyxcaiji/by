package 腾讯;
/**
 * 插入堆尾：PUSH X
 * 取出队首：TOP //不删除
 * 删除队首:POP
 * 队列大小：SIZE
 * 清空队列:CLEAR
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        String n = scanner.nextLine();
        for(int i=0;i<Integer.parseInt(n);i++)
        {
            String m1=scanner.nextLine();
          //  System.out.println(m1);
            int m = Integer.parseInt(m1);
//            int m = Integer.parseInt(m1);
//            StringBuffer stringBuffer=new StringBuffer();
//            for(int o=0;o<m;o++)
//            {
//                if(o==6)
//                {
//                    stringBuffer.append(scanner.nextLine());
//                }
//                stringBuffer.append(scanner.nextLine());
//                stringBuffer.append(".");
//            }
//            System.out.println(stringBuffer.toString());
//            System.out.println(m1);
            String[] strings=new String[m];
            for(int j=0;j<strings.length;j++)
            {
                String s = scanner.nextLine();
                strings[j]=s;
            }
          //  System.out.println(Arrays.toString(strings));
            shu(queue,strings);
            queue.clear();
        }
        scanner.close();
    }
    public static void shu(Queue<Integer> queue,String[] strings)
    {
        for(int k=0;k<strings.length;k++)
        {
            String[] s = strings[k].split(" ");
          //  System.out.println(Arrays.toString(s)+"....");
            if(s.length==1)
            {
                if(s[0].equals("TOP"))
                {
                    getFirst(queue);
                }else if(s[0].equals("POP")){
                    deleteFirst(queue);
                }
                else if(s[0].equals("SIZE")){
                    getSize(queue);
                }
                else if(s[0].equals("CLEAR")){
                    clearQ(queue);
                }
            }else {
                insetLast(queue,Integer.parseInt(s[1]));
            }
        }
    }
    //插入队尾
    public static void insetLast(Queue<Integer> queue,int x)
    {
        queue.add(x);
    }
    //取出队首
    public static void getFirst(Queue<Integer> queue)
    {
        if(queue.size()>0)
        {
            System.out.println(queue.peek());
        }else {
            System.out.println("-1");
        }
    }
    //删除队首
    public static void deleteFirst(Queue<Integer> queue)
    {
        if(queue.size()>0)
        {
            queue.poll();
        }else {
            System.out.println("-1");
        }
    }
    //护额的队列大小
    public static void getSize(Queue<Integer> queue)
    {
        System.out.println(queue.size());
    }
    //清空队列
    public static void clearQ(Queue<Integer> queue)
    {
        queue.clear();
    }
}
