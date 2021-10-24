package leet_code.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Day103 {
    public static void main(String[] args) {
        System.out.println(Day103.zigzagLevelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root!=null)
            queue.add(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0;i<n;i++){
                TreeNode node = queue.poll();
                if (flag){
                    level.add(node.val);
                }else {
                    level.add(0,node.val);
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            flag = !flag;
            res.add(level);
        }
        return res;
    }
}
