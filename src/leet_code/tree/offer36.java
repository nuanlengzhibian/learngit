package leet_code.tree;

public class offer36 {
    static TreeNode pre, head;
    public static void main(String[] args) {

    }
    public TreeNode treeToDoublyList(TreeNode root) {
       if (root == null)
           return null;
       dfs(root);
       head.left = pre;
       pre.right = head;
       return head;
    }
    public static  void dfs(TreeNode cur) {
        if (cur == null)
            return;
        dfs(cur.left);
        if (pre == null)
            head = cur;
        else if (pre != null)
            pre.right = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }

}
