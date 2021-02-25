package thread.并发;

public class LinkedTransferQueue {
    public static void main(String[] args) {
        java.util.concurrent.LinkedTransferQueue transferQueue=new java.util.concurrent.LinkedTransferQueue();

        //如果把  消费者 放在前面,transfer可以正常执行
        new Thread(()->{
            try {
                System.out.println("消费者"+transferQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            transferQueue.transfer("aaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        //但是如果 消费者 放在后面,transfer就会阻塞
//        new Thread(()->{
//            try {
//                System.out.println("消费者"+transferQueue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }
}
