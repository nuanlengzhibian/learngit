package leet_code.tree;

public class Day129 {
    public static void main(String[] args) {
        System.out.println(Day129.sumNumbers(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0))));
    }
    public static int sumNumbers(TreeNode root) {
        return traverse(root,0);
    }
    public static int traverse(TreeNode root,int temp){
        if (root == null)
            return 0;
        int i = temp*10 + root.val;
        if (root.right == null && root.left == null)
            return i;
        return traverse(root.right,i)+traverse(root.left,i);
    }
}
