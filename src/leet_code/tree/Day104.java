package leet_code.tree;

public class Day104 {
    public static void main(String[] args) {
        System.out.println(Day104.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else{
            int leftdepth = maxDepth(root.left);
            int rightdepth = maxDepth(root.right);
            return Math.max(leftdepth,rightdepth)+1;
        }
    }

}
