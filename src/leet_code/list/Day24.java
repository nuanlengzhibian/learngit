package leet_code.list;

public class Day24 {
    public static void main(String[] args) {
        ListNode a = Day24.swapPairs(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4)))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode cur = pre;
        while(cur.next!=null && cur.next.next!=null){
            ListNode tempNext = cur.next.next;
            cur.next.next = cur.next.next.next;
            tempNext.next = cur.next;
            cur.next = tempNext;
            cur = cur.next.next;

            //单纯的改变节点内部的值,该方法不提倡
//            int temp = cur.val;
//            cur.val = cur.next.val;
//            cur.next.val = temp;
//            cur = cur.next.next;
        }
        return pre.next;


    }
}
