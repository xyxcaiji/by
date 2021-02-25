package lectout;

import java.util.Scanner;

/**
 * #include<stdio.h>
 * int main() {
 *     printf("hello"); <> comment
 *     <<comment
 *     comment>>
 *     printf("world");
 * }
 */
public class 代码清空 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            if(line.contains("<<")||line.contains(">>"))
            {
                continue;
            }
            if(!(line.contains("<")||line.contains(">")))
            {
                System.out.println(line);
            }
            else {
                System.out.println(line.trim());
                //line.trim();
                //if(line.)
            }
        }
    }
}
