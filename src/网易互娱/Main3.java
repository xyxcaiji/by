package 网易互娱;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        int kua = kua(5, "34561245892364388201628");
        System.out.println(kua);
    }
    public static int[] split_into_list (int N, String S) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        char[] chars = S.toCharArray();
        for(int i=0;i<chars.length;i++){

        }
        return null;
    }
    public static int kua(int n,String s){
        int kua=1;
        while (true){
            int a=Integer.parseInt(s.substring(n,n+kua));
            int b=Integer.parseInt(s.substring(n-kua,n));
            int c=Integer.parseInt(s.substring(n-kua*2,n-kua));
            if(a==b+c){
                break;
            }
            kua++;
        }
        return kua;
    }
}
