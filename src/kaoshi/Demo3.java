package kaoshi;

import java.util.Arrays;

/*
俄罗斯套娃
2020春实习-北京-JAVA软件研发工程师
 */
public class Demo3 {
    public static void main(String[] args) {
        int[][] enve={{5,4},{6,4},{6,7},{2,3},{1,3}};
        int i = maxWa(enve);
        System.out.println(i);
    }
    public static int maxWa(int[][] envelopes)
    {
        if(envelopes==null||envelopes.length==0)
        {
            return 0;
        }
// KEYPOINT 对数组进行宽w升序，高h降序的排序
        // 排序前 [4,5],[4,6],[6,7],[2,3],[1,1]
        // 排序后 [1,1],[2,3],[4,6],[4,5],[6,7]
        Arrays.sort(envelopes,(e1,e2)->e1[0]-e2[0]!=0?e1[0]-e2[0]:e2[1]-e1[1]);
       // Arrays.sort(envelopes, (int []a, int []b)->(a[0]-b[0]));
        int N = envelopes.length;
        // dp array
        int []f = new int[N];
        Arrays.fill(f, 1);

        int res = 1;
        for(int i=1; i<N; ++i){
            for(int j=0; j<i; ++j){
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1] <envelopes[i][1])
                    f[i] = Math.max(f[i], f[j]+1);
            }
            res = Math.max(f[i], res);
        }
        return res;


    }
}
