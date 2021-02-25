package lectout;
/*
矩阵香蕉
 */
public class Demo20 {
    public static void main(String[] args) {
        int[] rec1={0,0,2,2};
        int[] rec2={1,1,3,3};
        System.out.println(equal(rec1,rec2));
    }
    public static boolean equal(int[] rec1,int[] rec2)
    {
        //卡死不相交的几个点 其余都香蕉
        if(rec1[1]>=rec2[3] || rec2[1]>=rec1[3])
        {
            return false;
        }
        if(rec1[0]>=rec2[2] || rec2[0]>=rec1[2])
        {
            return false;
        }
        return true;
    }
}
