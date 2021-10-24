package leet_code.list;

public class Day92 {
    public static void main(String[] args) {
        ListNode a = Day92.reverseBetween(new ListNode(3,new ListNode(5)),1,1);
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right)
            return head;
        ListNode prev = null ,succ = null;
        ListNode curr = head;
        ListNode left_node = null,right_node = null;
        int k = 1;
        for (ListNode a = head;a!=null;a=a.next){
            if (k == left-1)
                prev = a;
            if (k == left)
                left_node = a;
            if (k == right){
                right_node = a;
                succ = right_node.next;
            }
            k++;
        }
        k = 1;
        ListNode prevTemp = null;
        while(curr!=null){
            if (k>=left && k<=right){
                ListNode nextTemp = curr.next;
                curr.next = prevTemp;
                prevTemp = curr;
                curr = nextTemp;
            }else {
                prevTemp = curr;
                curr = curr.next;
            }
            k++;
        }
        if (prev != null){
            prev.next = right_node;
            left_node.next = succ;
            return head;
        }else{
            left_node.next = succ;
            return right_node;
        }



    }
}
