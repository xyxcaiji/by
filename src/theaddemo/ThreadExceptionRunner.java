package theaddemo;

public class ThreadExceptionRunner implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException(
                "error!"
        );
    }
}