package leet_code.tree;

public class Day617 {
    public static void main(String[] args) {
        Day617.mergeTrees(new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2)),new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7))));
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        if (root1 != null && root2 != null)
            root1.val = root1.val + root2.val;
        TreeNode leftNode = mergeTrees(root1.left,root2.left);
        TreeNode rightNode = mergeTrees(root1.right,root2.right);
        root1.left = leftNode;
        root1.right = rightNode;
        return root1;
    }

}
