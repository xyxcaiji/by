package 腾讯;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class L2 {
    static ArrayList<Integer> t1=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        int[] nums=new int[s.length];
        nums[0]=Integer.parseInt(s[0]);
        nums[1]=Integer.parseInt(s[1]);
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        int m=nums[1];
        while (m>0){
            String l1 = scanner.nextLine();
            String[] s1 = l1.split(" ");
            ArrayList<Integer> ls=new ArrayList<>();
            for(int i=0;i<s1.length;i++){
                ls.add(Integer.parseInt(s1[i]));
            }
            lists.add(ls);
            m--;
        }
        t1.add(0);
        for(int i=0;i<nums[1];i++){
            for(int j=0;j<lists.size();j++){
                count(t1,lists.get(j));
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<t1.size();i++){
            set.add(t1.get(i));
        }
        System.out.println(set.size()-1);
    }
    public static void count(ArrayList<Integer> list,ArrayList<Integer> temp){
        int j=0;
        for(int i=0;i<list.size();i++)
        {
            if(temp.contains(list.get(i))){
                j++;
            }
        }
        if(j!=0){
            list.addAll(temp);
        }
    }
}
