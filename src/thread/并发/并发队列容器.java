package thread.并发;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class 并发队列容器 {
    static Queue<String> ticket=new ConcurrentLinkedQueue<>();

    static {
        for(int i=0;i<1000;i++) ticket.add("票的编号"+i);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            new Thread(()->{
                while (true)
                {
                    String s=ticket.poll();
                    if(s==null) break;
                    else System.out.println("销售了--"+s);
                }
            }).start();
        }
    }
}
