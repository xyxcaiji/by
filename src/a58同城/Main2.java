package a58同城;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(question(100,200));
    }
    public static int question (int a, int b) {
        // write code here
        boolean b1=false;
        boolean b2=false;
        for(int i=500;i>0;i--)
        {
            int t1=i+a;
            b1=judge(t1);
            if(b1==true)
            {
              int t2=i+b;
              b2=judge(t2);
            }
            if(b1==true&&b2==true)
            {
                return i;
            }
        }
        return 0;
    }
    public static boolean judge(int t)
    {
        for(int i=0;i<t/2;i++)
        {
            if(i*i==t)
            {
                //System.out.println(i+"=="+t);
                return true;
            }
        }
        return false;
    }
}
