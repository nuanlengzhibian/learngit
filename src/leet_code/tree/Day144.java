package leet_code.tree;

import java.util.ArrayList;
import java.util.List;

public class Day144 {
    int[] a = new int[105];
    int i = 0;
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Traverse(root);
        for (int i1=0;i1<i;i1++) {
            res.add(a[i1]);
        }
        return res;
    }
    public void Traverse(TreeNode root){
        if (root == null)
            return ;
        a[i++] = root.val;
        Traverse(root.left);
        Traverse(root.right);
    }
}
