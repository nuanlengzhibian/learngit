package leet_code.tree;

import java.util.Arrays;

public class offer54 {
//    int[] a = new int[10000];
//    int i = 0;
    int res = 0;
    int k = 0;
    public static void main(String[] args) {

    }
    public int kthLargest(TreeNode root, int k) {
//        Traverse(root);
//        Arrays.sort(a,0,i-1);
//        for (int j = i-1;;j--){
//            if (j==i-k)
//                return a[j];
//        }
        this.k = k;
        Traverse(root);
        return res;

    }

//    public void Traverse(TreeNode root){
//        if (root == null)
//            return;
//        Traverse(root.left);
//        a[i++] = root.val;
//        Traverse(root.right);
//    }
    public void Traverse(TreeNode root){
        if (root == null)
            return;
        Traverse(root.left);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        Traverse(root.right);
    }
}
