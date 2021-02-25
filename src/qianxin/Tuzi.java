package qianxin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
题干：有一对可爱的兔子，他们从出生后的第五个月开始，每个月生1对小兔子，新生的小兔子五个月后也会开始生兔子，兔子不会死亡，那么第n个月的时候，会有多少对兔子呢？如第五个月，答案：2对。
 */
public class Tuzi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            int n=scanner.nextInt();
            if(n<0)
            {
                System.out.println("输入的是非法的数，请重新输入");
                continue;
            }
            int rabbit=1;
            Queue<Integer> queue=new LinkedList<Integer>();
            for(int i=1;i<=n;i++)
            {
                //因为前四个月，小兔子都不会生娃，只有一对
                if(i-4<=0)
                {
                    //将前四个月都是1的加入队列
                    queue.offer(1);
                    continue;
                }
                //举个例子
                //从第五个月开始
                //每次取四个月前的兔子数量+原本的兔子数量
                //因为从第四个月后，每个月新增的兔子对数就是你四个月前生下的兔子对数
                Integer poll = queue.poll();
                rabbit+=poll;
                queue.offer(rabbit);
            }
            System.out.println("第"+n+"个月后兔子有"+rabbit);
        }
    }
}
