package meituan;

import java.util.Scanner;

/*
手动输入 n是几列

 ..x.x
 xx...   找出去的路径又几条

 可以走的方法有三种
 1：右走
 2：右下方走
 3：右上方走
 */
public class meituan01 {
    public static void main(String[] args) {
        System.out.println("请输入要几列:");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] map=new char[2][n];
        for(int i=0;i<2;i++)
        {
            map[i]=scanner.next().toCharArray();
        }
        //输出显示你输入的
        for(char[] chars:map)
        {
            for(char c:chars)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        //判断如果是1列那么只需要考虑两个值如果全是 '.'那么输出1 否则输出-1
        if(n==1)
        {
            if(map[0][0]=='.'&&map[1][0]=='.')
            {
                System.out.println(1);
            }else {
                System.out.println(-1);
            }
        }else {
            int temp=0;
            //从后往前遍历 （从前往后也可以）
            //这是通过列来遍历
            for(int i=n-1;i>=1;i--)
            {
                //判断这一列 是不是全都是'.' 如果全都是 那么证明又两种方法进来
                if(map[1][i] == '.' &&map[0][i]=='.')
                {
                    temp+=2;
                }
                //如果全都是'X',那么证明路断了 直接返回-1,不能走了
                else if ( map[1][i]=='X'&&map[0][i]=='X'){
                    temp=-1;
                    break;
                }
            }
            //如果map[0][0]，肯定没法走 返回-1
            if(temp==0&&map[0][0]=='X')
            {
                System.out.println(-1);
            }
            //如果经过for了 temp还是==0，且map[0][0]是'.'，那么路径只能是1种
            else if(temp==0&&map[0][0]=='.')
            {
                System.out.println(1);
            }
            //最后返回temp
            else {
                System.out.println(temp);
            }
        }

    }
}
