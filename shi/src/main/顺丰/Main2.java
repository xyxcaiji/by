package main.顺丰;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int[] number = findNumber(2);
        System.out.println(number[0]+"    "+number[1]);
    }
    static int[] findNumber(int num){
        int[] nums=new int[2];
        int target = count(num);

        int t1=num;
        int c1=0;
        while (t1+1<=Integer.MAX_VALUE||c1!=target){
            ++t1;
            c1= count(t1);
            if(c1==target){
                break;
            }
            if(t1==Integer.MAX_VALUE&&c1!=target){
                c1=-1;
                break;
            }
        }
        nums[0]=t1;

        int t2=num;
        int c2=0;
        while (t2-1>=0||c1!=target){
            --t2;
            c2= count(t2);
            if(c2==target){
                break;
            }
            if(t2==0&&c2!=target){
                c2=-1;
                break;
            }
        }
        nums[1]=t2;
        return nums;
    }
    static int count(int temp){
        int count=0;
        for(int i=0;i<32;i++){
            if(((temp>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
}
