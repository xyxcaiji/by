package thread;
/*
同步锁
synchroized
 */
/*
不加的话就会出现
甲取钱成功800.0
乙取钱成功800.0
	余额为200.0
	余额为-600.0
 */
public class Demo3 {
    public static void main(String[] args) {
        Account account=new Account("1234567",1000);
        //模拟两个线程同时操作账号
        new DradThread2("甲", account, 800).start();;
        new DradThread2("乙", account, 800).start();;
    }
}
