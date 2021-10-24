package leet_code.list;

public class Day206 {
    public static void main(String[] args) {
        ListNode a = Day206.reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4)))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return pre;
    }
}
