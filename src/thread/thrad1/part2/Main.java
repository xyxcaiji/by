package thread.thrad1.part2;
/*
 传进去一个对象 让两个线程共享一个对象
 会出现抢占的问题  就是买了超出
 */
public class Main {
    public static void main(String[] args) {
     Tickliang tickliang=new Tickliang(1000);
     Salar s1=new Salar("南站",tickliang);
     Salar s2=new Salar("北站",tickliang);
     s1.start();
        s2.start();
    }
}
