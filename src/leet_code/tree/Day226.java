package leet_code.tree;

public class Day226 {
    public static void main(String[] args) {
        Day226.invertTree(new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9))));
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
