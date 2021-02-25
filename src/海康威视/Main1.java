package 海康威视;

public class Main1 {
    public static void main(String[] args) {
        String hexColor = "#55667780";
        String strR = hexColor.substring(1,3);
        String strG = hexColor.substring(3,5);
        String strB = hexColor.substring(5,7);
        int red = Integer.parseInt(strR,16);
        int green = Integer.parseInt(strG,16);
        int blue = Integer.parseInt(strB,16);
        System.out.println(red+"="+green+"="+blue);
    }
}
