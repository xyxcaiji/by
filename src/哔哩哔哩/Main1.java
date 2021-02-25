package 哔哩哔哩;

public class Main1 {
    public static void main(String[] args) {
        int[] arr={7,2,1,10};
        System.out.println(110);
    }
    public static boolean Game(int[] arr)
    {
        int t1=arr[0];
        int t2=arr[1];
        int t3=arr[2];
        int t4=arr[3];
        if(t1*t2+t3*t4==24||t1*t2-t3*t4==24||t1*t2/t3*t4==24)
        {
            return true;
        }
        return false;
    }
    public static boolean judge(int num,int[] arr,int i)
    {
        return false;
    }
}
