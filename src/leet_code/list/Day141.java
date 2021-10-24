package leet_code.list;

public class Day141 {
    public static void main(String[] args) {

    }
    public static boolean hasCycle(ListNode head) {
        //利用双指针法进行作答，主要用到了快慢指针的用法，当快指针追上慢指针时就说明链表中有环。
        ListNode fast=head,slow=head;
       while (fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
           if (fast==slow)
               return true;
       }
        return false;
    }
}
