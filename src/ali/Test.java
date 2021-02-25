package ali;

import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    public static void main(String[] args)  {
        Test test = new Test();
        test.outPrint(1);
    }
    private int age = 12;

    public  void outPrint(int x) {
        class InClass {
            public void InPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new InClass().InPrint();
    }
    public void test(int b) {
        final int a = 10;
        new Thread(){
            public void run() {
                System.out.println(a);
                System.out.println(b);
            };
        }.start();
    }
}

class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}