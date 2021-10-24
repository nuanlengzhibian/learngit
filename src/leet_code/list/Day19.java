package leet_code.list;

public class Day19 {
    public static void main(String[] args) {
        ListNode a = Day19.removeNthFromEnd(new ListNode(1,new ListNode(2)),1);
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int listLength = 0;
        for (ListNode a=head;a!=null;a=a.next){
            listLength++;
        }
        if (listLength == 1)
            return null;
        if (listLength == n){
            head = head.next;
            return head;
        }

        ListNode cur = new ListNode(-1);
        cur.next = head;
        for (int i =listLength;;i--){
            if (i==n){
                cur.next = cur.next.next;
                break;
            }
            else
                cur = cur.next;

        }
        return head;

        //快慢指针
    }
}
