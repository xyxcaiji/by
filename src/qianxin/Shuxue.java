package qianxin;

import java.math.BigDecimal;
import java.util.Scanner;

/*
题干：有1000枚硬币，其中有10枚是金币，从中取出n枚硬币，求这n枚硬币中有金币的概率。答案保留6位小数。如抽取一枚，金的概率0.010000
 */
/*
我们可以逆向思维，可能性只有两种，要么有金的，要么没金的，那我们可以计算没有金的的概率，用（1-没有金的），不就是有金的概率了吗？

好的我们来列一下数学公式：

没有金的概率 = （从990枚中抽取n枚的所有可能）/（从1000枚中抽取n枚的所有可能）
 */
public class Shuxue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double result = 0;
            if (n <= 0) {
                result = 0;
            }
            if (n > 990) {
                result = 1;
            }
            //设置分子分母，因为
            double top = 1;
            double under = 1;
            //分子分母中存在重复的 记得排除
            for (int action = 1000; action > 990; action--) {
                under *= action;
            }
            for (int action = 1000 - n; action > 990 - n + 1; action--) {
                top *= action;
            }
            result = 1 - top / under;
            //然后格式化小数位
            BigDecimal bigDecimal = new BigDecimal(result);
            System.out.println(bigDecimal.setScale(6, BigDecimal.ROUND_HALF_UP));
        }
    }
}
