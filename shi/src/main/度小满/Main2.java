package main.度小满;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int k=Integer.parseInt(line[1]);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextLine());
        }
        findMin(list,k,n);
    }
    public static void findMin(ArrayList<String> list,int k,int n){
        int[][] temp=new int[n][list.get(0).length()];
        for(int i=0;i<n;i++){
            for(int j=0;j<list.get(i).length();j++){
                char c = list.get(i).charAt(j);
                if(c=='0'){
                    temp[i][j]=1;
                }else if(c=='#'){
                    temp[i][j]=k;
                }else if(c=='#'){
                    temp[i][j]=-1;
                }
            }
        }
        temp[0][0]=0;
        System.out.println("No solution");

    }
    public static int[] find(int i,int j,char[][] temp,int n,int m,int k){
        if(i<0||i+1>=n||j<0||j+1>=m){
            return null;
        }
        int[] ij=new int[2];
        char c = temp[i+1][j];
        int t=0;
        if(c=='0'){
            t=1;
        }else if(c=='#'){
            t=k;
        }else if(c=='#'){
            t=Integer.MAX_VALUE;
        }
        char c1 = temp[i][j+1];
        int t1=0;
        if(c1=='0'){
            t1=1;
        }else if(c1=='#'){
            t1=k;
        }else if(c1=='#'){
            t1=Integer.MAX_VALUE;
        }
        if(t1==Integer.MAX_VALUE&&t==Integer.MAX_VALUE){
            ij[0]=0;
            ij[1]=0;
            return ij;
        }
        if(t<t1){
            ij[0]=i+1;
            ij[1]=j;
            return ij;
        }else {
            ij[0]=i;
            ij[1]=j-1;
            return ij;
        }
    }
}
