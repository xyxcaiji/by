package main.神州;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        String da="1 2 4 3";
        System.out.println(sort(da));
    }
    public static int sort(String inData){
        String[] str = inData.split(" ");
        int[] tempArr = new int[str.length];
        int[] sortArr = new int[str.length];
        for(int i=0;i<tempArr.length;i++){
            tempArr[i] = Integer.parseInt(str[i]);
            sortArr[i] = Integer.parseInt(str[i]);
        }
        int count=0;
        int j=0;
        Arrays.sort(sortArr);
        for(int i=0;i<tempArr.length;i++){
            if(tempArr[i]==sortArr[j]){
                count++;
                j++;
            }
        }
        return tempArr.length-count;
    }
}
