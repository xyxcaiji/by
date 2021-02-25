package thread.thrad1;

public class Demo1 {
    static class Run extends Thread{
        @Override
        public void run() {
            for(int i=0;i<100;i++)
            {
                System.out.println(this.getName()+"跑步---"+i);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    static class Chang extends Thread{
        @Override
        public void run() {
            for(int i=0;i<100;i++)
            {
                System.out.println(this.getName()+"唱歌---"+i);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        new Run().start();
        new Chang().start();
    }
}
