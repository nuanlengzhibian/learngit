package leet_code.list;

public class Day142 {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        //利用双指针法进行作答，主要用到了快慢指针的用法，当快指针追上慢指针时就说明链表中有环。
        ListNode fast=head,slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                slow=head;
                while (fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
