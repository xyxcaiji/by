package lectout;

public class 二叉树最大路径和 {
    private int ret=Integer.MIN_VALUE;
    public static void main(String[] args) {

    }
    public int maxPathSum(TreeNode treeNode)
    {
        getMax(treeNode);
        return ret;
    }
    private int getMax(TreeNode r)
    {
        if(r==null) return 0;
        int left=Math.max(0,getMax(r.left));
        int right=Math.max(0,getMax(r.right));
        ret=Math.max(ret,r.val+left+right);
        return Math.max(left,right)+r.val;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
