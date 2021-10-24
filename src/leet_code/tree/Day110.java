package leet_code.tree;

public class Day110 {
    public static void main(String[] args) {
        System.out.println(Day110.isBalanced(new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4),new TreeNode(4)),new TreeNode(3)),new TreeNode(2))));
    }
    public static boolean isBalanced(TreeNode root) {
       if (root == null)
           return true;
       if (Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1)
           return isBalanced(root.left)&&isBalanced(root.right);
       else
           return false;
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
