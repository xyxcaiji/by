package 网易互娱;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        findMin(a,b,n);
    }
    public static void findMin(int a,int b,int n){
        int t1=a;
        int[] anum=new int[n];
        int[] bnum=new int[n];
        for(int i=0;i<n;i++){
            bnum[i]=b%10;
            b/=10;
        }
        ArrayList<ArrayList<Integer>> list = getList(bnum);
        int[] temp=new int[list.size()];
        for(int i=0;i<list.size();i++){
            StringBuilder sb1=new StringBuilder();
            for(int j=0;j<list.get(i).size();j++){
                sb1.append(list.get(i).get(j));
            }
            temp[i]=Integer.parseInt(sb1.toString());
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(t1<=temp[i]){
                System.out.println(temp[i]);
                break;
            }else if(i==temp.length-1&&temp[temp.length-1]<t1){
                System.out.println(-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>>  getList(int[] nums)
    {
        int temp=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) temp++;
        }
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        int[] user=new int[nums.length];
        test(lists,new ArrayList<>(),nums,user);
        return lists;
    }
    public static void test(List<ArrayList<Integer>> lists, List<Integer> templist, int[] nums, int[] used)
    {
        if(templist.size()==nums.length)
        {
            lists.add(new ArrayList(templist));
        }else{
            for(int i=0;i<nums.length;i++)
            {
                if(used[i]==1 || (i>0&&used[i-1]==0 && nums[i-1]==nums[i])) continue;
                used[i]=1;
                templist.add(nums[i]);
                test(lists,templist,nums,used);
                templist.remove(templist.size()-1);
                used[i]=0;
            }
        }
    }
}
