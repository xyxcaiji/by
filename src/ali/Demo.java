package ali;

public class Demo {
    public static void main(String[] args) {
        String s="abc";
        String s1="ab";
        String s2="c";
        String s3="ab"+"c";
        String str=new String("abc");
        System.out.println(s==str);
        System.out.println(s3==s);
    }
}
