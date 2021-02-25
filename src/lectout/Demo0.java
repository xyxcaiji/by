package lectout;

public class Demo0 {
    public static void main(String[] args) {
        int num=12345;
        int i=0;
        while (num>0){
            num&=num-1;
            i++;
        }
        System.out.println(i);
    }
}
