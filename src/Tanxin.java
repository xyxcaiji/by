import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Tanxin {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");
        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");
        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");
        HashSet<String> hashSet4 = new HashSet<String>();
        hashSet4.add("上海");
        hashSet4.add("天津");
        HashSet<String> hashSet5 = new HashSet<String>();
        hashSet5.add("杭州");
        hashSet5.add("大连");
        broadcasts.put("K1", hashSet1);
        broadcasts.put("K2", hashSet2);
        broadcasts.put("K3", hashSet3);
        broadcasts.put("K4", hashSet4);
        broadcasts.put("K5", hashSet5);

        HashSet<String> allAreads = new HashSet<String>();
        allAreads.add("北京");
        allAreads.add("上海");
        allAreads.add("天津");
        allAreads.add("广州");
        allAreads.add("深圳");
        allAreads.add("杭州");
        allAreads.add("大连");

        //存取被选择的key
        ArrayList<String> select = new ArrayList<String>();
        //存取遍历过程中电台覆盖的地区和没有覆盖地区的交际
        HashSet<String> tempset = new HashSet<String>();
        //存储临时变量最大的key用的 看下面
        String maxKey = null;
        while (allAreads.size() != 0) {
            //每进行一次while后将maxkey清空
            maxKey = null;
            for (String key : broadcasts.keySet()) {
                //临时存储的tempset清0
                tempset.clear();
                HashSet<String> areas = broadcasts.get(key);

                tempset.addAll(areas);
                //和allAreads取交集，取出他们都有的城市
                tempset.retainAll(allAreads);
                //tempset.size()>broadcasts.get(key).size() 这步是最关键的 他会判断你选择的电台是不是最好的，你选择的电台覆盖的地区是不是最优的
                //判断你这次遍历选择的覆盖地区的是不是大于上一次选择覆盖的区域，如果大于，就将这次的key赋给maxkey
                if (tempset.size() > 0 && (maxKey == null || tempset.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }
            if (maxKey != null) {
                //把最优选择的maxkey存到我们的select集合中
                select.add(maxKey);
                //顺便在未覆盖的城市里面删掉我们已经覆盖的地区
                allAreads.removeAll(broadcasts.get(maxKey));
            }
        }
        System.out.println(select);

    }
}
