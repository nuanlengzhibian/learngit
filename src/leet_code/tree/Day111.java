package leet_code.tree;

public class Day111 {
    public static void main(String[] args) {
        System.out.println(Day111.minDepth(new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4,null,new TreeNode(5,null, new TreeNode(6)))))));
    }
    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right != null && root.left == null)
            return 1+minDepth(root.right);
        if (root.left != null && root.right == null)
            return 1+minDepth(root.left);
        else{
            int left_depth = minDepth(root.left);
            int right_depth = minDepth(root.right);
            return Math.min(left_depth,right_depth)+1;
        }
    }
}
