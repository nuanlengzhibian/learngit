package leet_code.list;

public class Day445 {
    public static void main(String[] args) {
        ListNode a  = Day445.addTwoNumbers(new ListNode(7,new ListNode(2,new ListNode(4,new ListNode(3)))),new ListNode(5,new ListNode(6,new ListNode(4))));
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode reverse_l1 = reverseList(l1);
        ListNode reverse_l2 = reverseList(l2);
        //进行两个链表存储的值的相加
        int carry = 0;
        ListNode l3 = null;
        while(reverse_l1 != null || reverse_l2 != null || carry != 0){
            int sum = 0, curr = 0;
            if(reverse_l1 != null){
                sum += reverse_l1.val;
                reverse_l1 = reverse_l1.next;
            }
            if(reverse_l2 != null){
                sum += reverse_l2.val;
                reverse_l2 = reverse_l2.next;
            }
            sum += carry;
            curr = sum % 10;
            carry = sum / 10;
            // 这一段逆序生成链表 官解上看到的代码 值得学习！
            ListNode curNode = new ListNode(curr);
            curNode.next = l3;
            l3 = curNode;
        }
        return l3;
    }
    //反转链表
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return pre;
    }
}
