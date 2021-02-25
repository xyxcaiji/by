package 搜狗;

public class Main2 {
    public static void main(String[] args) {
        int[] xa={-1,4,5,2,8,2};
        int t=2;
        System.out.println(getHouse(t,xa));
        double v = t / 2.0;
    }
    public static int getHouse(int t,int[] xa)
    {
        int temp=2;
        for(int i=0;i<xa.length-4;i+=2)
        {
            double t1=(long) xa[i+1]/2.0;
            double t2=(long) xa[i+3]/2.0;
            double abs = Math.abs(xa[i] - xa[i+2]);
            double abs1 = abs - t1 - t2;
            if(abs1<0)
            {
                return 0;
            }
            if(abs1==t)
            {
                temp+=1;
            }else if(abs1>t)
            {
                temp+=2;
            }
        }
        return temp;
    }
}
