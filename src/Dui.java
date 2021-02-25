import javafx.scene.media.VideoTrack;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Dui {
    public static void main(String[] args) {
        int[] arr = {19, 97, 1, 8, 9, 17, 3, 18, 19, 1, 2, 4, 6, 79, 484, 54, 61, 22, 33, 44, 55, 66, 77, 99, 444, 55, 16, 23};
        heap(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void heap(int[] arr) {
        //第一次调整大顶堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapSort(arr, i, arr.length);
        }
        //将头节点与尾节点交换，再次进行调整堆
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapSort(arr, 0, i);
//            System.out.println(Arrays.toString(arr));
        }
    }

    public static void heapSort(int[] arr, int parent, int length) {
        //找一个临时变量存储父节点
        int temp = arr[parent];
        //找到左子节点
        int left = parent * 2 + 1;
        while (left < length) {
            int right = left + 1;
            if (right < length && arr[right] > arr[left]) {
                //后面使用left一个来算的，如果条件成立，相当于把left看成右子节点
                left++;
            }
            //一定要用temp储存初始父节点的值与下面的比较,不能用arr[parent]来比较,因为我们挑选的是最大的
            if (temp >= arr[left]) {
                break;
            }
            //如果子节点大于父节点，那就把子节点的值赋给父节点
            arr[parent] = arr[left];
            //继续向下筛选，看下面还有没有其他子节点大于父节点的
            //以子节点作为父节点，继续筛选
            parent = left;
            left = parent * 2 + 1;
        }
        //最后把初始的父节点赋给最后一个交换过的节点
        arr[parent] = temp;
    }

}
