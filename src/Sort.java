import sun.plugin.dom.exception.PluginNotSupportedException;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {19, 91, 8, 17, 1, 9, 5, 99, 9, 56, 2, 94, 56, 22};
        quickSort(arr, 0, arr.length - 1);
        //   selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //    public static  void selectSort(int[] arr)
//    {
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                int min=i;
//                if(arr[min]>arr[j])
//                {
//                    min=j;
//                }
//               if(i!=min)
//               {
//                   int temp=arr[i];
//                   arr[i]=arr[min];
//                   arr[min]=temp;
//               }
//            }
//        }
//    }
//    public static void maoSort(int[] arr)
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            //加个判断条件 如果那一次循环p没有变，没么证明已经排序好了，那就跳出循环，结束
//            boolean p=true;
//            for(int j=0;j<arr.length-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    p=false;
//                }
//            }
//            if(p)
//            {
//                break;
//            }
//        }
//    }
//
//    public static void xierSort(int[] arr)
//    {
//        int gap=arr.length;
//        while (true)
//        {
//            gap=gap/2;
//            for(int i=0;i<gap;i++)
//            {
//                for(int j=gap+i;j<arr.length;j+=gap)
//                {
//                    int temp=arr[j];
//                    int k=j-gap;
//                    //如果不把k设为j-gap可能会有数组越界的风险，我用k=j 一直没有算对，
//                    while (k>=0&&arr[k]>temp)
//                    {
//                        arr[k+gap]=arr[k];
//                        //每次减去gap
//                        k=k-gap;
//                    }
//                    //因为在while里面把k减了一次，但是如果while判断条件不成功的话还是要把gap加回来的
//                    arr[k+gap]=temp;
//                }
//             //   System.out.println("第"+i+"伦了");
//            }
//            if(gap==1)
//            {
//                break;
//            }
//        }
//    }
//    public static void   charRuSort(int []arr)
//    {
//        for(int i=1;i<arr.length;i++)
//        {
//            int temp=arr[i];
//            int j=i;
//            while(j>0&&temp<arr[j-1])
//            {
//                arr[j]=arr[j-1];
//                j--;
//            }
//            arr[j]=temp;
//        }
//    }
    public static void quickSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int left = l, right = r;
        int provit = arr[left];
        while (left < right) {
            //如果右边的值一直大于基准值，那么right就一直减减
            while (left < right && arr[right] > provit) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
            }
            //如果左边的值一直小于基准值,那么left就一直加加
            while (left < right && arr[left] < provit) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }
            //如果他们right==left了 第一轮的排序就结束，把基准值赋予他们相等的地方
            if (left >= right) {
                arr[left] = provit;
            }
        }
        //然后递归实现  left==right  左边与右边的排序
        System.out.println("..........1");
        //左边的
        quickSort(arr, l, right - 1);
        //右边的
        quickSort(arr, left + 1, r);
    }
}
