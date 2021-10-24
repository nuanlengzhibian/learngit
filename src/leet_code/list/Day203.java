package leet_code.list;

public class Day203 {
    public static void main(String[] args) {
        System.out.println(Day203.removeElements(null, 1));
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return null;
        for (ListNode a=head;a!=null;){
            if (a.val==val){
                a = a.next;
                head.val = head.next.val;
                head.next = head.next.next;
            }else{
                a = a.next;
            }
        }
        return head;
    }
}