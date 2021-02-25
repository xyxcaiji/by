package thread.马士兵.c_001;

import java.util.concurrent.Executor;

public class T implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();
    }

    public static void main(String[] args) {
        new T().execute(()-> System.out.println("hello"));
    }
}
