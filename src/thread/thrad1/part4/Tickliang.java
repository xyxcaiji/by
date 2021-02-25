package thread.thrad1.part4;

public class Tickliang {
    private int total;
    public Tickliang(int total){
        this.total=total;
    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    //处理敏感方法s
    public void mingan()
    {
        //敏感代码块
        if(total>0)
        {
            System.out.println(Thread.currentThread().getName()+"卖出了一张票,还剩"+total--);
        }
    }
}
