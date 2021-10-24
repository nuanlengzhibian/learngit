package leet_code.tree;

public class Day236 {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right !=null)
            return root;
        if (left == null && right == null)
            return null;
        return  left == null? right:left;
    }
}
