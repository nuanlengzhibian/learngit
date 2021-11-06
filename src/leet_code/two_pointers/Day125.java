package leet_code.two_pointers;

public class Day125 {
    public static void main(String[] args) {
        System.out.println(Day125.isPalindrome("pP"));
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int head = 0,tail = n-1;
        if (n == 0)
            return true;
        while(head<=tail){
            if (Character.isDigit(s.charAt(head)) || (s.charAt(head)>='A'&& s.charAt(head)<='Z') || (s.charAt(head)>='a' && s.charAt(head)<='z')){
                if (Character.isDigit(s.charAt(tail)) || (s.charAt(tail)>='A'&& s.charAt(tail)<='Z') || (s.charAt(tail)>='a' && s.charAt(tail)<='z')){
                    if (s.charAt(head)==s.charAt(tail) || (!Character.isDigit(s.charAt(head)) && !Character.isDigit(s.charAt(head)) && Math.abs(s.charAt(head)-s.charAt(tail))==32)){
                        head++;
                        tail--;
                       // continue;
                    }
                    else
                        return false;
                }
                else
                    tail--;


            }else
                head++;


        }
        return true;
    }
}
