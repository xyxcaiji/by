package lectout;

import javax.swing.tree.TreeNode;

public class 二叉树检查平衡性 {
    public static boolean isBalanced(TreeNode root)
    {
        if(root==null) return true;
        if(Math.abs(dfs(root.left)-dfs(root.right))>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int dfs(TreeNode root)
    {
        if(root==null) return 0;
        return Math.max(dfs(root.left),dfs(root.right))+1;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
