package lectout;

import java.util.Arrays;
import java.util.Queue;

/**
 * 输入：n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
 * 输出：2
 */
public class 联通网络的操作次数 {
    private static int[] parent;
    public static int makeConnected(int[][] connection,int n)
    {
        if(connection.length<n-1)
        {
            return -1;
        }
        //初始化
        parent=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }
        //合并
        for(int[] con:connection)
        {
            union(con[0],con[1]);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(parent[i]==i)
            {
                count++;
            }
        }
        System.out.println(Arrays.toString(parent));
        return count-1;
    }
    public static int find(int node){
        return parent[node]==node?node:(parent[node]=find(parent[node]));
    }
    public static void union(int node1,int node2)
    {
        int root1=find(node1);
        int root2=find(node2);
        if(root1==root2)
        {
            return;
        }
        parent[root1]=root2;
    }

    public static void main(String[] args) {
        int[][] connectionws={{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(connectionws,4));
    }
}
