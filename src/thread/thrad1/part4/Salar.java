package thread.thrad1.part4;



public class Salar extends Thread {
    private Tickliang tickliang;
    public Salar(String name, Tickliang tickliang)
    {
        super(name);
        this.tickliang=tickliang;
    }

    @Override
    public void run() {
        while (true)
        {
            //同步代码块
            synchronized (tickliang)
            {
                tickliang.mingan();
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}