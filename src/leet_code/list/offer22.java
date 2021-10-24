package leet_code.list;

public class offer22 {
    public static void main(String[] args) {

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
//        int count =0;
//        ListNode point=head;
        //求链表的长度
//        for (;point!=null;){
//            count++;
//            point=point.next;
//        }
//        point=head;
//        for (int i=count-k;i>0;i--){
//            point=point.next;
//        }
//        return point;

        //法二 快慢指针法
        ListNode fast = head;
        while(fast!=null) {
            fast = fast.next;
            if(k==0) {
                head = head.next;
            }else {
                k--;
            }
        }
        return head;
    }
}
