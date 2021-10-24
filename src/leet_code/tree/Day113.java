package leet_code.tree;

import java.util.ArrayList;
import java.util.List;

public class Day113 {
  //  static boolean flag = false;
    public static void main(String[] args) {
        System.out.println(Day113.pathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22));
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        if (root == null)
//            return null;
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> path = new ArrayList<>();
//
//        for (){
//          //  flag = hasPathSum(root, targetSum);
//            if (flag == true)
//                res.add(path);
//        }
//
//        return res;

        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root.val == targetSum && root.left == null && root.right == null){
            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            ans.add(arr);
            return ans;
        }
        List<List<Integer>> left = pathSum(root.left,targetSum - root.val);
        List<List<Integer>> right = pathSum(root.right,targetSum - root.val);
        for(List<Integer> list : left){
            list.add(0,root.val);
            ans.add(list);
        }
        for(List<Integer> list : right){
            list.add(0,root.val);
            ans.add(list);
        }
        return ans;
    }

//    public static void hasPathSum(TreeNode root, int targetSum) {
//        if (root == null && )
//            return;
//        targetSum = targetSum - root.val;
//        hasPathSum(root.left, targetSum);
//        hasPathSum(root.right,targetSum);
//    }
}
