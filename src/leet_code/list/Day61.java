package leet_code.list;

public class Day61 {
    public static void main(String[] args) {
        ListNode a =Day61.rotateRight(null,0);
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {

        ListNode fast = head,slow = head;
        if (head == null)
            return head;
        int len = 0;
        for (ListNode temp = head;temp!=null;temp=temp.next){
            len++;
        }
        k = k % len;
        if (k == 0)
            return head;
        for (int i = k;i>0;i--){
            fast=fast.next;
        }
        while (fast!=null){
            if (fast.next==null){
                ListNode nextNode = slow.next;
                slow.next = fast.next;
                fast.next = head;
                return nextNode;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return head;
        //另外一种方法是将链表形成环之后再从k处断开。
    }
}
