package lectout;

import java.util.LinkedHashMap;

public class 整数转罗马数 {
    public static String intToRoman(int num)
    {
        String res="";
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strings={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<nums.length;i++)
        {
            while (num>=nums[i])
            {
                res+=strings[i];
                num-=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
}
