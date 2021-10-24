package leet_code.tree;

public class Day543 {
    static int  max = 1;
    public static void main(String[] args) {
        System.out.println(Day543.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max-1;
    }
    public static int depth(TreeNode node){
        if (node == null)
            return 0;
        int leftdepth = depth(node.left);
        int rightdepth = depth(node.right);
        max = Math.max(max,leftdepth+rightdepth+1);
        return Math.max(leftdepth,rightdepth)+1;
    }
}
