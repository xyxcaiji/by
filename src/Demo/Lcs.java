package Demo;
/*
最长公共子序列
 */
public class Lcs {
    public static void main(String[] args) {
        String a="1asdwhionco";
        String b="wrqrasdino";
        int lcs = lcs(a, a.length(), b, b.length());
        System.out.println(lcs);
    }
    public static int lcs(String a,int n,String b,int m)
    {
        int[][] di=new int[n+1][m+1];
//        for(int i=0;i<=n;i++)
//        {
//            for(int j=0;j<=m;j++)
//            {
//                di[i][j]=0;
//            }
//        }
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    di[i][j]=di[i-1][j-1]+1;
                }else{
                    di[i][j]=(di[i-1][j]-di[i][j-1]>0)?di[i-1][j]:di[i][j-1];
                }
            }
        }
        return di[n][m];
    }
}
