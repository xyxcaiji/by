package main.伴鱼;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(movingCount(0,0,0));
    }
    public static int movingCount(int m,int n,int k){
        int[][] nums=new int[m][n];
        int answer=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(judge(i,j,k)){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static boolean judge(int i,int j,int k){
        String i1 = String.valueOf(i);
        String j1 = String.valueOf(j);
        ArrayList<Integer> list=new ArrayList<>();
        for(int a=0;a<i1.length();a++){
            list.add(Integer.parseInt(i1.charAt(a)+""));
        }
        for(int a=0;a<j1.length();a++){
            list.add(Integer.parseInt(j1.charAt(a)+""));
        }
        int te=0;
        for(int a=0;a<list.size();a++){
            te+=list.get(a);
        }
        if(te<=k){
            return true;
        }else {
            return false;
        }
    }
}
