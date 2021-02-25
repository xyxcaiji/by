package bincha;

public class test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(8);
        int[] nums = {1, 2, 4, 9, 99};
        for (int data : nums) {
            binaryTree.insert(binaryTree, data);
        }
        preOrder(binaryTree);
    }

    public static void preOrder(BinaryTree root) {  //先根遍历
        if (root != null) {
            System.out.print(root.data + "-");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
