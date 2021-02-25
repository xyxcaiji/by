package main;

public class 测试 implements Sleep,Eat{
    @Override
    public void ioSleep(int i) {

    }
}
interface Sleep {
    public static int a = 1;
    public static int b = 2;
    public void ioSleep(int i);

}
interface Eat {
    public abstract void ioSleep(int i);
}