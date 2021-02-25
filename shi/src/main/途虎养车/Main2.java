package main.途虎养车;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        ArrayList<ArrayList<Integer>> list = zuHe(nums);
        System.out.println(reorder(nums));
        System.out.println(list);
    }
    public static int reorder (int[] prices) {
        // write code here
        Arrays.sort(prices);
        if(prices.length<=2){
            return 0;
        }
        int max=0;
        ArrayList<ArrayList<Integer>> list = zuHe(prices);
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> temp = list.get(i);
            int tempMax=0;
            for(int j=1;j<temp.size()-1;j++){
                if(temp.get(j)<temp.get(j-1)&&temp.get(j)<temp.get(j+1)){
                    tempMax++;
                }
            }
            max=Math.max(max,tempMax);
        }
        return max;
    }
    public static ArrayList<ArrayList<Integer>> zuHe(int[] prices){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int[] used = new int[prices.length];
        zu(lists,new ArrayList<Integer>(),prices,used);
        return lists;
    }
    public static void zu(ArrayList<ArrayList<Integer>> lists,ArrayList<Integer> tempList,int[] prices,int[] used){
        if(tempList.size()==prices.length){
            lists.add(new ArrayList<>(tempList));
        }else {
            for(int i=0;i<prices.length;i++){
                if(used[i]==1 || (i>0&&used[i-1]==0 && prices[i-1]==prices[i])) continue;
                used[i]=1;
                tempList.add(prices[i]);
                zu(lists,tempList,prices,used);
                tempList.remove(tempList.size()-1);
                used[i]=0;
            }
        }
    }
}
