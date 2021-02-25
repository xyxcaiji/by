package VIPKID;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(line.length()==0)
            {
                break;
            }
            String[] s = line.split(" ");
            list.add(Integer.parseInt(s[0]));
            list.add(Integer.parseInt(s[1]));
        }
        //System.out.println(list);
        heBing(list);
    }
    public static void heBing(ArrayList<Integer> list)
    {
        int[][] x=new int[list.size()/2][2];
        int t=0;
        for(int i=0;i<list.size();i+=2)
        {
            x[t][0]=list.get(i);
            x[t][1]=list.get(i+1);
            t++;
        }
        for(int i=0;i<list.size()/2;i++)
        {
            int t1=x[i][0];
            int t2=x[i][1];
            for(int j=0;j<list.size()/2;j++)
            {
                if(x[j][0]!=0&&x[j][1]!=0)
                {
                    if(x[j][1]>=t1&&x[j][1]<=t2&&x[j][0]<=t1)
                    {
                        t1=x[j][0];
                        x[j][0]=0;
                        x[j][1]=0;
                    }else if(x[j][0]>=t1&&x[j][1]<=t2){
                        x[j][0]=0;
                        x[j][1]=0;
                    }else if(x[j][0]>=t1&&x[j][0]<=t2&&x[j][1]>=t2){
                        t2=x[j][1];
                        x[j][0]=0;
                        x[j][1]=0;
                    }else {
                        continue;
                    }
                }

            }
            x[i][0]=t1;
            x[i][1]=t2;
        }
        for(int i=0;i<list.size()/2;i++)
        {
            if(x[i][0]!=0&&x[i][1]!=0)
            {
                System.out.println(x[i][0]+" "+x[i][1]);
            }
        }
    }
}
