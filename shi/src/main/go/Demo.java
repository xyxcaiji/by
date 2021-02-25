package main.go;

import ali.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    private static int a;
    public static void main(String[] args) {
//        int[] candidates = {1,2,5,10};
//        System.out.println(combinationSum(candidates,3));
        Integer b=0;
        String s1="123";
        String s2= new String(s1);
        String s3=new String("123");
        int i=new Integer(28);
        Integer j=new Integer(i);
        System.out.println(a==b);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(i==j);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listAll=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        //排序
        Arrays.sort(candidates);
        find(listAll,list,candidates,target);
        return listAll;
    }
    public static void find(List<List<Integer>> listAll,List<Integer> tmp,int[] candidates, int target){
        if(target==0){
            listAll.add(tmp);
            return;
        }
        if(target<candidates[0]) return;
        for(int i=0;i<candidates.length&&candidates[i]<=target;i++){
            List<Integer> list=new ArrayList<>(tmp);
            list.add(candidates[i]);
            find(listAll,list,candidates,target-candidates[i]);
        }
    }
}
