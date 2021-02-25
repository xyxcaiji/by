package ali;
/*
  阿里面试题  不会
 */
public class Demo1 {
    public static void main(String[] args) {

    }
    public static int find(String[] strings,char cc)
    {
        if(strings.length==0||strings==null)
        {
            return 0;
        }
        int[] di=new int[strings.length];
        char min=strings[0].charAt(0);

        int temp=1;
        int len=strings[0].length();
        char c = strings[0].charAt(0);
        while (true)
        {
            char c1 = strings[temp].charAt(strings[temp].length() - 1);
            c= (char) Math.min(c,c1);
            len+=strings[temp].length();
            if(temp==strings.length-1)
            {
                break;
            }

        }
        return 0;
    }
}
