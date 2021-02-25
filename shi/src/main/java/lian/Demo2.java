package main.java.lian;

public class Demo2 {
    public static void main(String[] args) {
        String s="123i03.333.";
        System.out.println(findMax(s));
    }
    public static int findMax(String str){
        char[] chars = str.toCharArray();
        int max=0;
        for(int i=0;i<chars.length;){
            if(chars[i]<'0'&&chars[i]>'9'){
                continue;
            }
            max=Math.max(find(chars,i),max);
            if(max!=0){
                i+=max;
            }else {
                i++;
            }
        }
        return max;
    }
    public static int find(char[] chars,int i){
        StringBuilder sb1=new StringBuilder();
        int j=i;
        int temp=0;
        int max=0;
        for(;j<chars.length;j++){
            if (chars[j] >= '0' && chars[j] <= '9') {
                sb1.append(chars[j]+"");
                max++;
            }else if(chars[i]=='.'&&temp<1){
                sb1.append(chars[j]+"");
                max++;
                temp++;
            }else {
                break;
            }
        }
        int ji=0;
        String s = sb1.toString();
        for(int c=0;c<s.length();i++){
            if(s.charAt(c)=='0'){
                ji++;
            }else {
                break;
            }
        }
        return max-ji;
    }
}
