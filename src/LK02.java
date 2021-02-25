import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LK02 {
    public static void main(String[] args) {
        System.out.println("wudi".length());
        Set wwwwwddddd = test("wwwwwddddd");
        System.out.println(wwwwwddddd);
//        HashMap hashMap = new HashMap();
//        hashMap.put("李四", 1);
//        Object 李四 = hashMap.put("李四", 2);
//        System.out.println(李四);
    }

    public static HashSet test(String c) {
        long l = System.currentTimeMillis();
        HashSet<Character> map = new HashSet<Character>();
        for (int i = 0; i < c.length(); i++) {
            map.add(c.charAt(i));
        }
        System.out.println(System.currentTimeMillis() - l + "毫秒");
        return map;
    }
}
