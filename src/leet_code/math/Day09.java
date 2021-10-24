package leet_code.math;

public class Day09 {
    public static void main(String[] args) {
        System.out.println(Day09.isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int count = 0;
        int temp = x;
        while(temp!=0){
            count = count*10 + temp % 10;
            temp= temp/10;
        }
        return count==x;
    }
}
