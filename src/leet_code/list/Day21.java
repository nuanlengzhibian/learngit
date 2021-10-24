package leet_code.list;



public class Day21 {
    public static void main(String[] args) {
        ListNode a=Day21.mergeTwoLists(new ListNode(1,new ListNode(2,new ListNode(4))),
                new ListNode(1,new ListNode(3,new ListNode(4))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//方法一
//        if(l1==null)return l2;
//        if(l2==null)return l1;
//        ListNode ans = null;
//        if(l1.val<l2.val){
//            ans=l1;
//            l1=l1.next;
//        }
//        else{
//            ans=l2;
//            l2=l2.next;
//        }
//        ListNode root=ans;
//        while(l1!=null&&l2!=null){
//            if(l1.val<l2.val){
//                root.next=l1;
//                l1=l1.next;
//                root=root.next;
//            }
//            else{
//                root.next=l2;
//                l2=l2.next;
//                root=root.next;
//            }
//        }
//        if(l1==null)root.next=l2;
//        else root.next=l1;
//        return ans;
//方法二  递归的思想不断进行迭代
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        
    }
}