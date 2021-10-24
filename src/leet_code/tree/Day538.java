package leet_code.tree;

public class Day538 {
    static int count = 0;
    public static void main(String[] args) {

    }
    public static TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        convertBST(root.right);
        count += root.val;
        root.val = count;
        convertBST(root.left);
        return root;
    }
}
