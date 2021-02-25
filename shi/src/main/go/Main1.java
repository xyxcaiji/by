package main.go;

import sun.security.provider.Sun;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String[] words={"time","me","bell"};
        System.out.println(minimumLengthEncoding(words));
    }
    public static int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }
        System.out.println(set);
        int ans = 0;
        for (String word : set) {
            ans += word.length() + 1;
        }
        return ans;
    }
    public static int maxArea(char[][] grid)
    {
        int num=0;
        int result=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    result=Math.max(finMax(grid,i,j),result);
                    if(result!=0){
                        num++;
                    }
                }
            }
        }
        return num;
    }
    public static int finMax(char[][] grid,int i,int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!='1')
        {
            return 0;
        }
        grid[i][j]='0';
        return 1+finMax(grid,i+1,j)+finMax(grid,i-1,j)+finMax(grid,i,j-1)+finMax(grid,i,j+1);
    }

    public static List<List<Integer>>  permuteUnique(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        int[] user=new int[nums.length];
        test(lists,new ArrayList<>(),nums,user);
        return lists;
    }
    public static void test(List<List<Integer>> lists,List<Integer> templist,int[] nums,int[] used)
    {
        if(templist.size()==nums.length)
        {

            lists.add(new ArrayList<>(templist));
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
