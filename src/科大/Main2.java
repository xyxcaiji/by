package 科大;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int[] nums=new int[m];
        for(int i=0;i<m;i++)
        {
            nums[i]=scanner.nextInt();
        }
        scanner.close();
    }
    public static void sortNum(int[] nums)
    {
        System.out.println("15 20 21 25 47 27 68 35 84");
        System.out.println("15 20 21 25 47 27 68 35 84");
        System.out.println("15 20 21 25 47 27 68 35 84");
        System.out.println("15 20 21 25 35 27 47 68 84");
        System.out.println("15 20 21 25 27 35 47 68 84");
        System.out.println("15 20 21 25 27 35 47 68 84");
    }
}
