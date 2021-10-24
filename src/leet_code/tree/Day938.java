package leet_code.tree;

public class Day938 {
    int[] a = new int[20005];
    int i = 0;
    public static void main(String[] args) {
        //new Day938().rangeSumBST();
    }
    public int rangeSumBST(TreeNode root, int low, int high) {

        int res = 0;
        inOrderTraverse(root);
        for (int i1 : a) {
            if (i1>=low && i1<= high)
                res = res + i1;
        }
        return res;
        //    if (root == null) return 0;
//
//        if(root.val >= L && root.val <= R) {
//        //当前节点再两数之间，把自身值加到结果里取，并往左右子节点递归
//        return root.val + rangeSumBST(root.left, L ,R) + rangeSumBST(root.right, L , R);
//    } else if(root.val < L){
//        //当前节点小于L，往右子节点寻找
//        return rangeSumBST(root.right, L, R);
//    } else {
//        //当前节点大于R，往左子节点寻找
//        return rangeSumBST(root.left, L, R);
//    }
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
