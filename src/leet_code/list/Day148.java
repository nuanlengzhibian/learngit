package leet_code.list;

import java.util.Arrays;

public class Day148 {
    public static void main(String[] args) {
        ListNode a = Day148.sortList(null);
        for (;a!=null;){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode sortList(ListNode head) {
        int[] temp = new int[50010];
        int i = 0;
        for (ListNode m = head;m!=null;m=m.next){
            temp[i++]= m.val;
        }
        Arrays.sort(temp,0,i);
        i = 0;
        for (ListNode m = head;m!=null;m=m.next){
            m.val = temp[i++];
        }
        return head;
    }

}
