package 爱奇艺;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        judge(line);
    }
    public static void judge2(String line){
        HashSet<String> set=new HashSet<>();
        int x=0,y=0;
        set.add(x+""+y);
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)=='N')
            {
                y+=1;
            }else if(line.charAt(i)=='S')
            {
                y-=1;
            }
            else if(line.charAt(i)=='E')
            {
                x+=1;
            }
            else if(line.charAt(i)=='W')
            {
                x-=1;
            }
            if(!set.add(x+""+y)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }

    public static void judge(String line)
    {
        boolean b=false;
        int[][] ge=new int[100][100];
        int x=50,y=50;
        ge[50][50]=-2;
        for(int i=0;i<line.length();i++)
        {
            if(ge[x][y]==1||ge[x][y]==-1)
            {
                b=true;
                break;
            }
            if(line.charAt(i)=='N')
            {
                y+=1;
                ge[x][y]=1;
            }else if(line.charAt(i)=='S')
            {
                y-=1;
                ge[x][y]=1;
            }
            else if(line.charAt(i)=='E')
            {
                x+=1;
                ge[x][y]=1;
            }
            else if(line.charAt(i)=='W')
            {
                x-=1;
                ge[x][y]=1;
            }
        }
        if(b==true)
        {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
