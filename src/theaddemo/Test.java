package theaddemo;

import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Executors.newFixedThreadPool(4);
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(3);
    }
}
