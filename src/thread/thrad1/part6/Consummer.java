package thread.thrad1.part6;

public class Consummer extends Thread {
    Box box;
    public  Consummer(String name,Box box)
    {
        super(name);
        this.box=box;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            box.consumer();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
