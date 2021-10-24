package leet_code.tree;

public class Day112 {
    public static void main(String[] args) {
        System.out.println(Day112.hasPathSum(new TreeNode(5, new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null), new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1)))), 22));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            if (root.val == targetSum)
                return true;
            else
                return false;
        if (root.right == null && root.left !=null)
            return hasPathSum(root.left,targetSum - root.val);
        if (root.right != null && root.left ==null)
            return hasPathSum(root.right,targetSum - root.val);
        if (root.left !=null && root.right!=null)
            return hasPathSum(root.right,targetSum - root.val)||hasPathSum(root.left,targetSum- root.val);
        return false;
    }
}
