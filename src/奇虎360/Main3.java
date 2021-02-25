package 奇虎360;

import com.sun.org.apache.regexp.internal.RE;
import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while (scanner.hasNextLine()){
            String s=scanner.nextLine();
            char[] chars = s.toCharArray();
            int i=0;
            for(;i<chars.length/2;i++)
            {
                if((int)chars[i]<65||(int)chars[chars.length-i-1]>90)
                {
                    System.out.println("NO");
                }
                if(chars[i]!=chars[chars.length-i-1])
                {
                    System.out.println("NO");
                }
            }
            if(chars.length%2==1)
            {
                if(chars[i]=='A'||chars[i]=='H'||chars[i]=='I'||chars[i]=='M'
                        ||chars[i]=='0'||chars[i]=='T'||chars[i]=='U'
                        ||chars[i]=='V'||chars[i]=='W'||chars[i]=='X')
                {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
            System.out.println("YES");
        }
    }
    public static String judge(String s)
    {
            char[] chars = s.toCharArray();
            int i=0;
            for(;i<chars.length/2;i++)
            {
                if((int)chars[i]<65||(int)chars[chars.length-i-1]>90)
                {
                    return "NO";
                }
                if(chars[i]!=chars[chars.length-i-1])
                {
                    return "NO";
                }
            }
            if(chars.length%2==1)
            {
                if(chars[i]=='A'||chars[i]=='H'||chars[i]=='I'||chars[i]=='M'
                        ||chars[i]=='0'||chars[i]=='T'||chars[i]=='U'
                        ||chars[i]=='V'||chars[i]=='W'||chars[i]=='X')
                {
                    return "YES";
                }else {
                    return "NO";
                }
            }
        return "YES";
    }
}
