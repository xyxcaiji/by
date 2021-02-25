import java.io.IOException;


class A implements Runnable {
    Object o;

    public A(Object o) {
        this.o = o;
    }


    public void run() {
        while (true) {
            synchronized (o) {

                System.out.println("111111111111");
                System.out.println("222222222222");


                System.out.println("333333333333");
                System.out.println("444444444444");
                try {
                    o.notify();//唤醒正在等待的对方线程
                    o.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }
    }
}

class B implements Runnable {
    Object o;

    public B(Object o) {
        this.o = o;
    }

    public void run() {
        while (true) {
            // 同步锁
            synchronized (o) {

                System.out.println("AAAAAAAAAAAAAAAAAA");
                System.out.println("BBBBBBBBBBBBBBBBBB");


                System.out.println("CCCCCCCCCCCCCCCCCC");
                System.out.println("DDDDDDDDDDDDDDDDDD");
                try {
                    o.notify();//唤醒正在等待的对方线程
                    o.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        }

    }

}


public class Test {

    public static void main(String[] args) throws IOException {
        Object o = new Object();
        Thread t1 = new Thread(new A(o));
        Thread t2 = new Thread(new B(o));
        t1.start();
        t2.start();


    }

}
