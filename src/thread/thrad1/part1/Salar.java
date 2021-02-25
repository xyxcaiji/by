package thread.thrad1.part1;

public class Salar extends Thread {
    int total=0;
    public Salar(String name,int total)
    {
        super(name);
        this.total=total;
    }

    @Override
    public void run() {
        while (total-->0)
        {
            System.out.println(this.getName()+"卖出了一张票,还剩"+total);
        }
    }
}