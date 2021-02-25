package a58同城;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(translateNum(12111));
    }
    public static int translateNum (int num) {
        // write code here
        String s = String.valueOf(num);
        int answer=1;
        int i=0;
        int t1=0;
        int t2=1;
        int soze=s.length();
        while (i<s.length())
        {
            if(i+2>soze)
            {
                break;
            }
            if(Integer.parseInt(s.substring(i,i+2))<=25)
            {
                t1++;
                i+=2;
                continue;
            }
            i++;
        }
        if(t1>1)
        {
            for(int j=0;j<t1;j++)
            {
                t2*=2;
            }
            return answer+t2;
        }
        return answer+t1;
    }
}
