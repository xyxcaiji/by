package 练习;

public class LoopIV2 extends Thread{
    private static int currentCount = 0;

    public LoopIV2(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (currentCount < 30) {
            switch (currentCount % 3) {
                case 0:
                    if ("A".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
                case 1:
                    if ("B".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
                case 2:
                    if ("C".equals(getName())) {
                        printAndIncrease();
                    }
                    break;
            }
        }

    }

    private void printAndIncrease() {
        print();
        increase();
    }

    private void print() {
        System.out.println(getName());
        if ("C".equals(getName())) {
            System.out.println();
        }
    }

    private void increase() {
        currentCount++;
    }

    public static void main(String[] args) {
        new LoopIV2("A").start();
        new LoopIV2("B").start();
        new LoopIV2("C").start();
    }
}
