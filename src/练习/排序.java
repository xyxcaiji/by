package 练习;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class 排序 {
    public static void main(String[] args) {
        TreeMap<String,Integer> student=new TreeMap<>();
        student.put("张三",123);
        student.put("里斯",13);
        student.put("王麻子",131);
        student.put("二球",1);

        //TreeMap
        System.out.println(student);
        //Collections.sort(student);
    }
}
