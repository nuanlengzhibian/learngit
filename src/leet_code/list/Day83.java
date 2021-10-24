package leet_code.list;

public class Day83 {
    public static void main(String[] args) {
        ListNode a =Day83.deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(2))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.val==cur.next.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
