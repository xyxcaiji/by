public class Lcs {

    public static void main(String[] args) {
        String a = "12asdfa";
        String b = "we2rasdaswer";
        int lcs = findLcs(a, a.length(), b, b.length());
        System.out.println(lcs);
    }

    public static int findLcs(String a, int n, String b, int m) {
        //先将临时存储数组都初始化为0;
        int[][] path = new int[n + 1][m + 1];
        int[][] di = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                di[i][j] = 0;
                path[i][j] = 0;
            }
        }
        //因为初始化了一个二维数组
        //因为是从i=1开始遍历的，所以是i<=n
        //当 a[i]==b[i]时就把d[i-1][j-1]的值加1 因为这个存储的就是上一次循环最长公共子序列的长度
        //如果不相等 那么就把d[i-1][j]  d[i][j-1]看着两个谁大就取谁的
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    di[i][j] = di[i - 1][j - 1] + 1;
                    //
                  /*
                    String a="12asdfa";
                    String b="we2rasdaswer";
                    如果他找到了下一个相同的 就会给这个地方赋值为1
                    当然可能每一次循环会有冲=重复赋值的  就像上面俩个字符串，每一串字符串里面总有相同的字符
                    这些我会在下面找公共子序列的时候会挑出来
                   */
                    path[i - 1][j - 1] = 1;
                } else {
                    //如果他没有找到了下一个相同的 就会给这个地方赋值为2
                    di[i][j] = di[i - 1][j] - di[i][j - 1] > 0 ? di[i - 1][j] : di[i][j - 1];
                    path[i - 1][j - 1] = 2;
                }
            }
        }
          /*
        21222222222
        22212212222
        22221221222
        22222122222
        22222222222
        22212212222
        //每一次的第一个1就是我要找的公共字符 我会把这些跳出来组成一个字符串
         */
        //取出公共的值
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (path[i][j] != path[i][j - 1]) {
                    //只要他找到了第一个字符，就会直接结束这次循环，跳到下一次循环中，避免找到重复的
                    System.out.print(b.charAt(j));
                    break;
                }
                //下面两个//是遍历path数组用的
                //   System.out.print(path[i][j]);
            }
            //  System.out.println();
        }
        System.out.println();
        return di[n][m];
    }


}

