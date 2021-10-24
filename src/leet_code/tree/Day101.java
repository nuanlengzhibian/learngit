package leet_code.tree;

public class Day101 {
    public static void main(String[] args) {
        Day101.isSymmetric(new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(2,new TreeNode(4),new TreeNode(3))));
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root.left,root.right);
    }
    public static boolean dfs(TreeNode left, TreeNode right) {
        //递归的终止条件是两个节点都为空
        //或者两个节点中有一个为空
        //或者两个节点的值不相等
        if(left==null && right==null) {
            return true;
        }
        if(left==null || right==null) {
            return false;
        }
        if(left.val!=right.val) {
            return false;
        }
        //再递归的比较 左节点的左孩子 和 右节点的右孩子
        //以及比较  左节点的右孩子 和 右节点的左孩子
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
}
