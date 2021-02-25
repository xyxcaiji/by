package thread.thrad1.part2;

public class Salar extends Thread {
    private Tickliang tickliang;
    public Salar(String name, Tickliang tickliang)
    {
        super(name);
        this.tickliang=tickliang;
    }

    @Override
    public void run() {
        while (tickliang.getTotal()>0)
        {
            tickliang.setTotal(tickliang.getTotal()-1);
            System.out.println(this.getName()+"卖出了一张票,还剩"+tickliang.getTotal());
        }
    }
}