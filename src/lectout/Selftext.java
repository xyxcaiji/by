package lectout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Selftext {
    public static void main(String[] args) {
        Map<Integer,Integer> aList=new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        int[] value=new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            value[i]=Integer.parseInt(strings[i]);
            aList.put(Integer.parseInt(strings[i]), i);
        }
        Arrays.sort(value);
        int index=aList.size(),count=0;
        for (int i = 0; i < aList.size()-1; i++) {
            if (aList.get(value[i])>aList.get(value[i+1])) {
                aList.put(value[i+1], index++);
                count++;
            }
        }
        System.out.println(count);
    }
}
