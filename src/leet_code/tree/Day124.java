package leet_code.tree;

public class Day124 {
    static int res = Integer.MIN_VALUE;
    public static void main(String[] args) {
        System.out.println(Day124.maxPathSum(new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
    public static int maxPathSum(TreeNode root) {
        getMax(root);
        return res;
    }
    public static int getMax(TreeNode root){
        if (root == null)
            return 0;
        int left = Math.max(0,getMax(root.left));
        int right = Math.max(0,getMax(root.right));
        res = Math.max(res,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
