package main.java.lian;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        ArrayList<ArrayList<Integer>> list = find(nums);
        System.out.println(list.size());
        System.out.println(find(nums));
    }
    public static ArrayList<ArrayList<Integer>> find(int[] nums){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        dg(list,new ArrayList<Integer>(),nums);
        return list;
    }
    public static void dg(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<Integer>(temp));
        }else {
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                dg(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
