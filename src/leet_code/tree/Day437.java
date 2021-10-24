package leet_code.tree;


public class Day437 {
    public static void main(String[] args) {
        System.out.println(Day437.pathSum(new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3), new TreeNode(-2)), new TreeNode(2, null, new TreeNode(1))), new TreeNode(-3, null, new TreeNode(11))), 8));
    }
    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return pathSumStartWithRoot(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    public static int pathSumStartWithRoot(TreeNode root, int sum) {
        if (root == null) return 0;
        int ret = 0;
        if (root.val == sum)
            ret++;
        ret += pathSumStartWithRoot(root.left, sum - root.val) + pathSumStartWithRoot(root.right, sum - root.val);
        return ret;
    }
}
