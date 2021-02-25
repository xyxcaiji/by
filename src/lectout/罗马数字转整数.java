package lectout;


public class 罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        int romam=0;
        for(int i=0;i<s.length();i++)
        {
            switch (s.charAt(i))
            {
                case 'I':romam+=1;break;
                case 'V':romam+=5;break;
                case 'X':romam+=10;break;
                case 'L':romam+=50;break;
                case 'C':romam+=100;break;
                case 'D':romam+=500;break;
                case 'M':romam+=1000;break;
                default:
                    System.out.println("default");break;
            }
            if(i>0)
            {
                if((s.charAt(i)=='V'||s.charAt(i)=='X')&&s.charAt(i-1)=='I') romam=romam-1*2;
                if((s.charAt(i)=='L'||s.charAt(i)=='C')&&s.charAt(i-1)=='X') romam=romam-10*2;
                if((s.charAt(i)=='D'||s.charAt(i)=='M')&&s.charAt(i-1)=='C') romam=romam-100*2;
            }

        }
        return romam;
    }
}
