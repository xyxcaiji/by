import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Digui extends Dui {
    private static int n = 3;
    private static int[] arr = {1, 2, 3, 4, 5, 6};
    private static int di[][] = new int[][]{{1, 0, 0}, {2, 3, 0}, {4, 5, 6}};

    //三角形问题
    public static void main(String[] args) {
        int maxsum = maxsum(0, 0);
        System.out.println(maxsum);

    }

    static int maxsum(int i, int j) {
        if (i == n - 1) {
            return di[i][j];
        }
        int x = maxsum(i + 1, j);
        int y = maxsum(i + 1, j + 1);

        return Math.max(x, y) + di[i][j];
    }
}
