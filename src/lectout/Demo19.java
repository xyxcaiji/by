package lectout;

import java.util.Arrays;

/*
俄罗斯套娃
 */
public class Demo19 {
    public static void main(String[] args) {
        int[][] enve={{77,92},{22,22},{29,36},{50,46},{99,90}};
        System.out.println(findMax(enve));
    }
    public static int findMax(int[][] envelopess)
    {
        if(envelopess==null||envelopess.length==0)
        {
            return 0;
        }
        //最重要的是排序s
        //排序
        // KEYPOINT 对数组进行宽w升序，高h降序的排序
        // 排序前 [4,5],[4,6],[6,7],[2,3],[1,1]
        // 排序后 [1,1],[2,3],[4,6],[4,5],[6,7]
        Arrays.sort(envelopess,(e1,e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);

        int[] di=new int[envelopess.length];
        //吧单个元素看为是一个有序
        //下面就是安装 最长递增子序列来写的
        Arrays.fill(di,1);
        int res=1;
        for(int i=1;i<envelopess.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(envelopess[j][0]<envelopess[i][0]&&envelopess[j][1]<envelopess[i][1])
                {
                    di[i]=Math.max(di[i],di[j]+1);
                }
                res=Math.max(di[i],res);
            }
        }
        return res;
    }
}
