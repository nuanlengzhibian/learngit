package leet_code.list;

public class Day328 {
    public static void main(String[] args) {
        ListNode a = Day328.oddEvenList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8)))))))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode head_two = head.next;
        ListNode cur = head;
        ListNode tail = null;
        int k = 0;
        for (ListNode a = head;a!=null;a = a.next){
            k++;
        }
        while(cur!= null && cur.next!=null){
            if (cur.next.next == null)
                if (k%2!=0)
                    tail = cur.next;
                else
                    tail = cur;
            ListNode TempNext = cur.next;
            cur.next = cur.next.next;
            cur = TempNext;
        }
        tail.next = head_two;
        return head;
    }
}
