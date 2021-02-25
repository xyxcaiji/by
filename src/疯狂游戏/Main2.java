package 疯狂游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");
        String[] money = split[0].split(",");
        int[] value=new int[money.length];
        for(int i=0;i<value.length;i++)
        {
            value[i]=Integer.parseInt(money[i]);
        }
    }
    public static List<List<Integer>> append(int[] values,int n){
        List<List<Integer>> lists=new ArrayList<>();
        List list=new ArrayList();
        return lists;
    }
    public static void zuHe(List<List<Integer>> lists,List tempList,int money,int temp,int[] values)
    {
        if(money==temp)
        {
            if(!lists.contains(tempList))
            {
                lists.add(new ArrayList<>(tempList));
            }
        }else {
//            for(int i=0;i<)
        }
    }
}
