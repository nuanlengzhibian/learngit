package leet_code.tree;

public class Day98 {
//    int[] a = new int[10005];
//    int i = 0;
    public static void main(String[] args) {
        System.out.println(Day98.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }
    public static boolean isValidBST(TreeNode root) {
//        Traverse(root);
//        for (int k = 0;k<i-1;k++){
//            if (a[k+1]>a[k])
//                continue;
//            else
//                return false;
//        }
//        return true;
        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValidBST(TreeNode root,long lower,long upper){
        if (root == null)
            return true;
        if (root.val<=lower || root.val>=upper)
            return false;
        return isValidBST(root.left,lower, root.val)&& isValidBST(root.right, root.val,upper);
    }
    // 遍历后用数组的方法进行存储，缺点是空间开销比较大。
//    public void Traverse(TreeNode root){
//        if (root == null)
//            return;
//        Traverse(root.left);
//        a[i++] = root.val;
//        Traverse(root.right);
//    }
}

