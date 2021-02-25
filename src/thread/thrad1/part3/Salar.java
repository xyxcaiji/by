package thread.thrad1.part3;

import thread.thrad1.part3.Tickliang;

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
                //敏感代码块
                if(tickliang.getTotal()>0)
                {
                    tickliang.setTotal(tickliang.getTotal()-1);
                    System.out.println(this.getName()+"卖出了一张票,还剩"+tickliang.getTotal());
                }else{
                    break;
                }
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}