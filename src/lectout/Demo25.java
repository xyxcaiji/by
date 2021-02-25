package lectout;
/*
 扑克牌
 扑克牌中的顺子
 */
public class Demo25 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(run(nums));
    }
    public static boolean run(int[] nums)
    {
        if(nums==null||nums.length==0)
        {
            return false;
        }
        int[] buncket=new int[14];
        for(int i=0;i<nums.length;i++)
        {
            buncket[nums[i]]+=1;
            if(nums[i]!=0&&buncket[nums[i]]>1)
            {
                return false;
            }
        }
        //起始牌 和最大牌
        int start=-1,end=-1;
        for(int i=0,j=13;start==-1||end==-1;i++,j--)
        {
            if(buncket[i]==1&&start==-1) start=i;
            if(buncket[j]==1&&end==-1) end=j;
        }
        return end-start<=4;
    }
}
