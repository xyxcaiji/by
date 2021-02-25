package thread;

public class DradThread2 extends Thread{
    //模拟用户账户
    private  Account account;
    //要取钱的数目
    private  double drawAmount;

    public DradThread2(String name, Account account, double drawAmount)
    {
        super(name);
        this.account=account;
        this.drawAmount=drawAmount;
    }

    @Override
    public void run() {
        synchronized (account)
        {
            if(account.getBalance()>drawAmount)
            {
                System.out.println(getName()+"取钱成功"+drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance()-drawAmount);
                System.out.println("\t余额为"+account.getBalance());
            }else{
                System.out.println("余额不足，取钱失败");
            }
        }

    }
}
