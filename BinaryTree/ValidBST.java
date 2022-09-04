package BinaryTree;

// https://leetcode.com/problems/validate-binary-search-tree/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (root.left != null && root.val < root.left.val) {
            return false;
        }

        if (root.right != null && root.val > root.right.val) {
            return false;
        }

        return isValidBST(root.left) || isValidBST(root.right);
    }

    public static void main(String[] args) {
        ValidBST object = new ValidBST();

        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(object.isValidBST(root));

        TreeNode root2 = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        System.out.println(object.isValidBST(root2));

    }
}






