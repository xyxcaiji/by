class TT implements Runnable {
    int i = 1;

    public void run() {
        try {
            Thread.sleep(5000);
            i = 10;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();
        t.join();
        System.out.println(tt.i);

    }

}
