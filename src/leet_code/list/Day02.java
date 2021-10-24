package leet_code.list;

public class Day02 {
    public static void main(String[] args) {
        ListNode a = Day02.addTwoNumbers(new ListNode(7,new ListNode(2,new ListNode(4,new ListNode(3)))),new ListNode(5,new ListNode(6,new ListNode(4))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode curNode = pre;
        int sum = 0,carry = 0,cur = 0;
        while(l1!=null || l2!=null || carry!=0){
            sum = 0;
            if (l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2!=null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            cur = sum % 10;
            carry = sum/10;
            //从头开始建立链表
            ListNode Node = new ListNode(cur);
            curNode.next = Node;
            curNode = curNode.next;
        }
        return pre.next;
    }
}
