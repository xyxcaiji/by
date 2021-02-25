

import java.util.Timer;
import java.io.IOException;


class A1 implements Runnable {
    Thread t2;

    public A1(Thread t2) {
        this.t2 = t2;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("a:" + i);
            if (i == 5) {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

class B1 implements Runnable {


    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("b:" + i);
        }

    }

}


public class Thread1 {

    public static void main(String[] args) throws IOException {
        Thread t2 = new Thread(new B1());
        Thread t1 = new Thread(new A1(t2));
        t1.start();
        t2.start();
        //唤醒当前正在挂起的线程

    }

}
