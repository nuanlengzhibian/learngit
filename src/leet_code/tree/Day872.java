package leet_code.tree;

public class Day872 {
    int[] a = new int[205];
    int i = 0;
    int[] b = new int[205];
    int j = 0;
    public static void main(String[] args) {
        System.out.println(new Day872().leafSimilar(new TreeNode(119,new TreeNode(113,new TreeNode(11,new TreeNode(43,new TreeNode(67,null,null),new TreeNode(74,null,null)),new TreeNode(76,null,null)),new TreeNode(30,new TreeNode(15,null,null),new TreeNode(60,null,null))),null),
                new TreeNode(11,new TreeNode(69,new TreeNode(115,new TreeNode(67,null,null),new TreeNode(74,null,null)),new TreeNode(66,null,new TreeNode(76,null,null))),new TreeNode(60,new TreeNode(15,null,null),new TreeNode(60,null,null)))));
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        inOrderTraverse(root1);
        inOrderTraverse1(root2);
        if (i == j){
            for (int k= 0;k<i;k++){
                if (a[k] == b[k])
                    continue;
                else
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    private void inOrderTraverse(TreeNode root) {
        if (root.left == null && root.right == null){
            a[i++] = root.val;
            return ;
        }
        try {
            inOrderTraverse(root.left);
        }catch (NullPointerException e){
           // return;
        }
        try {
            inOrderTraverse(root.right);
        }catch (NullPointerException e){
            //return;
        }
       // a[i++] = root.val;

    }
    private void inOrderTraverse1(TreeNode root) {
        if (root.left == null && root.right == null){
            b[j++] = root.val;
            return ;
        }

        try {
            inOrderTraverse1(root.left);
        }catch (NullPointerException e){

        }
        try {
            inOrderTraverse1(root.right);
        }catch (NullPointerException e){

        }
    }
}
