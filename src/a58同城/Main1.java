package a58同城;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> va=new ArrayList<>();
        int[] arr={3,7,16,10,21,23,37,15};
        System.out.println(find(arr,10));
    }
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        if(values.size()==1)
        {
            return values.get(0);
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<values.get(0).size();i++)
        {
            String temp=values.get(0).get(i);
            int t=1;
            for(int j=1;j<values.size();j++)
            {
                if(values.get(j).contains(temp)) t++;
            }
            if(t==values.size())
            {
                list.add(temp);
            }
        }
        return list;
    }
    //排序
    public static int find(int[] arr,int x){
        int answer =0;
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            if(arr[i]<=x){
                answer++;
            }
            if(2*i+1>=len||2*i+2>=len||arr[2*i+1]>x) break;
        }
        return answer;
    }
}
