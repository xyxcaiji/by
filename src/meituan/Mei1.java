package meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Mei1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入几列");
        int n = scanner.nextInt();
        System.out.println("请输入值");
        char[][] map=new char[2][n];
        for(int i=0;i<2;i++)
        {

            map[i]= scanner.next().toCharArray();

        }
        for(char[] ca:map)
        {
            for(char c:ca)
            {
                System.out.print(c);
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(strings));
        if (n == 1) {
            if (map[0][0] == '.' && map[1][0] == '.')
                System.out.println(1);
            else
                System.out.println(-1);
        }  else {
            int cnt = 0;
            boolean flag = true;
            for (int col = n - 1;col >= 1;col--) {
                if (map[0][col] == '.' && map[1][col] == '.')
                    cnt += 2;
                else if(map[0][col] == 'X' && map[1][col] == 'X') {
                    cnt = -1;
                    break;
                }
            }
            if (cnt == 0 || map[0][0] == 'X')
                System.out.println(-1);
            else
                System.out.println(cnt);
        }
    }
}
