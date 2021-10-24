package leet_code.tree;



public class Day783 {
    int[] a = new int[105];
    int i = 0;
    //TreeNode pre = null;   //pre记录前一节点
    //int res = Integer.MAX_VALUE;
    //int res = 10000;
    public static void main(String[] args) {
        System.out.println(new Day783().minDiffInBST(new TreeNode(27,null,new TreeNode(34,null,   new TreeNode(58,new TreeNode(50,new TreeNode(44),null),null)))));

    }
    public int minDiffInBST(TreeNode root) {

        int res = 100000;
        inOrderTraverse(root);
        //这两者有什么区别
        //new Day783().inOrderTraverse(root);
        for (int i1 = 1;i1 < i; i1++)
                if (Math.abs(a[i1]-a[i1-1])<res)
                    res = Math.abs(a[i1]-a[i1-1]);
        return res;
    }
    //左中右 中序遍历
    private void inOrderTraverse(TreeNode root) {
        if (root == null)
            return ;
        inOrderTraverse(root.left);
        a[i++] = root.val;
        inOrderTraverse(root.right);
    }
//    public int minDiffInBST(TreeNode root) {
//        dfs(root);
//        return res;
//    }
//    private void dfs(TreeNode root){
//        if(root == null) return;
//        dfs(root.left);
//        if(pre != null){
//            res = Math.min(root.val-pre.val,res);   //记录最小
//        }
//        pre = root;
//        dfs(root.right);
//    }
}


