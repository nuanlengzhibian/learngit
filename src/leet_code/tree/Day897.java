package leet_code.tree;

public class Day897 {
    int[] a = new int[105];
    int i = 0;
    int j = 0;
    public static void main(String[] args) {
        System.out.println(new Day897().increasingBST(new TreeNode(5, new TreeNode(1), new TreeNode(7))));
    }
    public TreeNode increasingBST(TreeNode root) {
        inOrderTraverse(root);
        TreeNode res = new TreeNode();
        res = initialize(res,j);
        return res;
    }

    //二叉树的初始化
    private TreeNode initialize(TreeNode root,int j){
        if (j == i)
            return null;
        root.val = a[j++];
        root.left = null;
        root.right = initialize(new TreeNode(),j);
        return root;
    }
    // 左中右 中序遍历
    private void inOrderTraverse(TreeNode root) {
        if (root == null)
            return ;
        inOrderTraverse(root.left);
        a[i++] = root.val;
        inOrderTraverse(root.right);
    }
}

