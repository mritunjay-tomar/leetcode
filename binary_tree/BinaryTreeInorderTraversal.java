package binary_tree;

// https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.List;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal object = new BinaryTreeInorderTraversal();

    }
}
