package leet_code.list;

public class Day234 {
    public static void main(String[] args) {
        System.out.println(Day234.isPalindrome(new ListNode(2,new ListNode(0,new ListNode(1)))));
    }
    public static boolean isPalindrome(ListNode head) {
//        ListNode slow,fast;
//        slow=head;
//        fast=head;
//        int count = 0;
//        int middle;
//        //先计算出整个链表的长度
//        for (;fast!=null;){
//            count++;
//            fast=fast.next;
//        }
//        if (count==1)
//            return true;
//        fast=head;
//        //再求出中间节点的位置
//        if (count%2==0){
//            middle=count/2;
//
//        }
//        else{
//            middle=(count - 1)/2;
//            fast=fast.next;
//        }
//        int[] a=new int[middle];
//        int[] b=new int[middle];
//        for (int i= 0;i<middle && slow!=null;i++){
//            a[i]= slow.val;
//            slow=slow.next;
//            fast=fast.next;
//        }
//        for (int j=0;j<count-middle && fast!=null;j++){
//            b[j]= fast.val;
//            fast=fast.next;
//        }
//        //将数组中的元素进行比较
//        for (int j= b.length-1,i=0;i<a.length;j--,i++){
//            if (a[i]!=b[j])
//                return false;
//        }
//        return true;

        //法二：利用数学的方法，存在数字太大的问题
//        long s1 = 0,s2 = 0,t = 1;
//
//        while(head != null) {
//            s1 = s1*10 + head.val;
//            s2 = s2 + t*head.val;
//            t = t*10;
//            head = head.next;
//        }
//        return s1 == s2;

        int[] num = new int[100010];
        int n = 0;
        for (ListNode a = head;a!=null;a=a.next){
            num[n++] = a.val;
        }
        for (int i =n-1,j=0;i>=j;i--,j++){
            if (num[i]!=num[j])
                return false;
        }
        return true;
    }
}
