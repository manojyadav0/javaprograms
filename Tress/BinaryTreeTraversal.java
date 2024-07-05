package Tress;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
public class BinaryTreeTraversal {
    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }
    public void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value + " ");
    }
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Preorder traversal:");
        tree.preorderTraversal(root);

        System.out.println("\nInorder traversal:");
        tree.inorderTraversal(root);

        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(root);
    }
}
