package leet_code.tree;

import java.util.ArrayList;
import java.util.List;

public class Day94 {
    public static void main(String[] args) {
        System.out.println(Day94.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Traverse(root,res);
        return res;

    }
    public static void Traverse(TreeNode root,List<Integer> res){
        if (root == null)
            return ;
        Traverse(root.left,res);
        res.add(root.val);
        Traverse(root.right,res);
    }
}
