package thread.thrad1.part6;

public class Shengchan extends Thread {
    Box box;
    public  Shengchan(String name,Box box)
    {
        super(name);
        this.box=box;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            box.productor();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
