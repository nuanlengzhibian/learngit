package leet_code;

public class Day231_2 {
    public static void main(String[] args) {
        System.out.println(Day231_2.isPowerOfTwo(1073741824));
    }
    public static boolean isPowerOfTwo(int n) {
        for (int i=1;i<(int)Math.pow(2,30);i=i*2){
            if (n < i)
                return false;
            if (n == i || n ==(int)Math.pow(2,30))
                return true;
        }
        return false;
    }
}
