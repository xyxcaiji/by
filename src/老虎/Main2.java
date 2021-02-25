package 老虎;

import sun.nio.cs.ext.MacArabic;

public class Main2 {
    public static void main(String[] args) {
        int[][] tasks={{0,1},{1,2},{1,3}};
        System.out.println(maxLevel(2,1,tasks));
    }
    public static int maxLevel(int x,int level,int[][] tasks)
    {
        int[] ji=new int[tasks.length];
        while (x>0)
        {
            int max=0;
            int temp=0;
            for(int i=0;i<tasks.length;i++)
            {
                if(ji[i]!=1&&level>=tasks[i][0])
                {
                    max=Math.max(tasks[i][1],max);
                }
                if(max==tasks[i][1])
                {
                    temp=i;
                }
            }
            level+=max;
            ji[temp]=1;
            x--;
        }
        return level;
    }
}
