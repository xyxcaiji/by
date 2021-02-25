package thread.并发;

public class Single安全单例 {
    public Single安全单例()
    {
        System.out.println("单例");
    }
    private static class Inner
    {
        private static Single安全单例 s=new Single安全单例();
    }
    public Single安全单例 get()
    {
       return Inner.s;
    }
}
