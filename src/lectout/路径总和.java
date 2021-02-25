package lectout;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class 路径总和 {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static boolean hasPathSum(TreeNode treeNode,int sum)
    {
        if(treeNode==null)
        {
            return false;
        }
        sum-=treeNode.val;
        if(treeNode.left==null&&treeNode.right==null)
        {
            return sum==0;
        }
        return hasPathSum(treeNode.left,sum)||hasPathSum(treeNode.right,sum);
    }
    public static void main(String[] args) {

    }
}
