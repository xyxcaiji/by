package lectout;

public class 连续数组的最大和 {
    public static void main(String[] args) {
        int[] arr={1,-2,3,10,-4,7,2,-5};
        int array[] = { 2, 3, -6, 4, 6, 2, -2, 5, -9 };
        System.out.println(maxSum(array,array.length));
    }

    /**
     * 一般算法
     *
     * @param arr
     * @param sz
     * @return
     */
    public static int maxSum(int[] arr,int sz)
    {
        if(arr==null||sz<=1) return 0;
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<sz;i++)
        {
            if(sum<0)
                sum=arr[i];
            else{
                sum+=arr[i];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
    /**
     * 动态规划
     */
    public static int judge(int a,int b)
    {
        return a>b?a:b;
    }
    public static int maxSum2(int[] arr,int sz)
    {
        if(arr==null||sz<=1) return 0;
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<sz;i++)
        {
            sum=judge(sum+arr[i],arr[i]);
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
