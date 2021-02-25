import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {25,84,21,47,15,27,68,35,20};
        quickSort(arr, 0, arr.length - 1);
        //System.out.println(Arrays.toString(arr));
    }

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
        System.out.println(Arrays.toString(arr));
        //左边的
        quickSort(arr, l, right - 1);
        //右边的
        quickSort(arr, left + 1, r);
    }
}