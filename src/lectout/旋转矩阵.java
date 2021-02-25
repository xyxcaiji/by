package lectout;


public class 旋转矩阵 {
    public static void main(String[] args) {
        int[][] nums={  {5, 1, 9,11},
                        {2, 4, 8,10},
                        {13, 3, 6, 7},
                        {15,14,12,16}
        };
        xuan(nums);
    }
    public static void xuan(int[][] nums)
    {
        int len=nums.length;
        //左右翻转
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len/2;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[i][len-1-j];
                nums[i][len-1-j]=temp;
            }
        }
        for(int[] num:nums)
        {
            for(int n:num)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        //对角线反转
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<len-1-i;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[len-1-j][len-1-i];
                nums[len-1-j][len-1-i]=temp;
            }
        }
        for(int[] num:nums)
        {
            for(int n:num)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
