public class Taijie {
    public static void main(String[] args) {
        int pa = pa(0);
        System.out.println(pa);
    }
    public static int pa(int n)
    {
        if (n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }

        return pa(n-1)+pa(n-2);
    }
}
