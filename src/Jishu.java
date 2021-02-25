import java.util.Arrays;
public class Jishu {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,3,2};
        //先获取最大值
        int max = getMax(arr);
        System.out.println(max);
        int[] ints = jiShu(arr, max);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] jiShu(int[] arr,int max)
    {
        //创建一个比最大值+1大的数组，这样数组才能达到a[max];
        int maxx=max+1;
        int[] jishu=new int[maxx];
        //假如数组是这样的{1,2,3,5,4,3,2}
        //那么中间的jishu=={0,1,2,2,1,1}
        //很简单，就是累加同一个数值出现的次数
        // 一个1所以存在jishu[1] 两个2所以存的是jishu[2] 两个3所以存的是jishu[2]
        for (int value:arr) {
            jishu[value]++;
        }
        //然后循环从i到maxx，
        //这里就是从低到高的再把数值存到arr里
        //因为有的jishu[i]>2,所以加个while循环，将里面存的次数都用完
        int sort=0;
        for(int i=0;i<maxx;i++)
        {
            while (jishu[i]>0)
            {
                arr[sort++]=i;
                jishu[i]--;
            }
        }
        return arr;
    }
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
