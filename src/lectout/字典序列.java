package lectout;

import java.util.ArrayList;
import java.util.List;

public class 字典序列 {
    public static void main(String[] args) {
        lexicalOrder(10);
        System.out.println(lexicalOrder(10));
    }
    public static List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++)
            dfs(n, i, res);
        return res;
    }
    private static void dfs(int n, int target, List<Integer> list) {
        if (target>n) return;
        list.add(target);
        target*=10;
        for (int i = 0; i < 10; i++)
            dfs(n,target+i,list);
    }
}
