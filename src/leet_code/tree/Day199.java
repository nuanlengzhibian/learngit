package leet_code.tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Day199 {
    public static void main(String[] args) {
        System.out.println(Day199.rightSideView(new TreeNode(1,new TreeNode(2),null)));
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root==null)
            return res;
        else
            queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0;i < n;i++){
                TreeNode node = queue.poll();
                if (node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
                if (i == n-1)
                    res.add(node.val);
            }
        }
        return res;
    }
}
