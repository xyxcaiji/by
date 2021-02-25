package 快手;

import java.util.ArrayList;
import java.util.Scanner;

public class Baozi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(",");
        System.out.println(five(s));

    }
    public static ArrayList<String> five(String[] nums){
//        String[] nums = line.split(",") ;
//存储nums[i]的豹子或顺子的长度
        int[] ans = new int[nums.length] ;
//判断当前的对应长度是豹子还是顺子得到的 ，因为输出的顺序豹子 > 顺子
        boolean[] flag = new boolean[nums.length] ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
//判断一下当前位置的 对应的豹子数或者顺子数的数量 ，并判断是豹子还是顺子
            int baozi = isBaoZi(nums[i]) ;
            int shunzi = isShunZi(nums[i]) ;
            if(baozi >= shunzi){
                ans[i] = baozi ;
                flag[i] = true ;
            }else{
                ans[i] = shunzi ;
                flag[i] = false ;
            }
            max = Math.max(max , Math.max(baozi , shunzi));
        }
        ArrayList<String> list = new ArrayList<>() ;
        while(max >= 0){
// 先返回同牌数的豹子 再返回同牌数的顺子 ，牌数再递减
            for(int i = 0 ; i < ans.length ;i++){
                if(ans[i] == max && flag[i] == true){
                    list.add(nums[i]);
                }
            }
            for(int i = 0 ; i < ans.length ; i++){
                if(ans[i] == max && flag[i] == false){
                    list.add(nums[i]) ;
                }
            }
            max-- ;
        }
        return list;
    }
    public static int isBaoZi(String nums){
        int ans = 1 ;
        int max = 1 ;
        for(int i = 3 ; i <= 9 ;i++){
            if(nums.charAt(i) == nums.charAt(i+1)){
                ans++ ;
                max = Math.max(ans , max);
            }else{
                ans = 1 ;
            }
        }
        return max >= 3 ? max : -1 ;
    }
    public static int isShunZi(String nums){
        int max = 1 ;
        int ans = 1 ;
        for(int i = 3 ; i <= 9 ; i++){
            if((int)nums.charAt(i) == (int)nums.charAt(i+1)-1){
                ans++ ;
                max = Math.max(ans , max);
            }else{
                ans = 1 ;
            }
        }
        return max >=3 ? max : -1 ;
    }
}
