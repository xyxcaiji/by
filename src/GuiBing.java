import java.util.Arrays;

public class GuiBing {
    public static void main(String[] args) {
        int[] arr = {19, 97, 1, 8, 9, 17, 3, 18, 19, 1, 2, 4, 6, 79, 484, 54, 61, 22, 33, 44, 55, 66, 77, 99, 444, 55, 16, 23};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] arr) {
        //arr = Arrays.copyOf(arr, arr.length);
        //如果递归的数组只有一个元素，那么直接返回，不用经过下面的
        if (arr.length < 2) {
            return arr;
        }
        //将每次递归的数组切半，知道他只剩下相邻的两个元素
        int moddile = (int) Math.floor(arr.length / 2);
        int[] left = Arrays.copyOfRange(arr, 0, moddile);
        int[] right = Arrays.copyOfRange(arr, moddile, arr.length);
        //这步是最厉害的
        //将每次得到的左右两个数组放在sort方法中继续进行分割，直到数组不能在分的时候，将数组进行排序合并
        //牛皮牛皮，我是很佩服写出这个的人的
        return merage(sort(left), sort(right));
    }

    public static int[] merage(int[] left, int[] right) {
        //先创建一个由两个数组长度之和的数组
        int[] merage = new int[left.length + right.length];
        int i = 0;
        //进行合并排序，知道其中一个数组的长度为0
        while (left.length > 0 && right.length > 0) {
            if (left[0] > right[0]) {
                merage[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                merage[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
            //   merage[i++]=(left[0]-right[0]>0)?left[0]:right[0];
        }
        //下面两个while循环
        //如果哪一个数组长度还不为0，那么就把那个长度不为0的数组，合并到新数组的后面
        while (left.length > 0) {
            merage[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            merage[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        //返回新数组，这样就得到了一个有序的新数组
        return merage;
    }
}
