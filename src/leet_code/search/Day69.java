package leet_code.search;

public class Day69 {
    public static void main(String[] args) {
        System.out.println(Day69.mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        //return (int)Math.sqrt(x)
        // x*x <= target      (x+1)*(x+1) > target
        int left = 0,right = x;
        int middle = 0;
        while(left<=right){
            middle = (left+right)/2;
            if ((long)middle*middle <= x && (long)(middle+1)*(middle+1) > x)
                return middle;
            if ((long)(middle+1)*(middle+1) < x){
                left = middle+1;
                continue;
            }
            if ((long)middle * middle > x){
                right = middle - 1;
                continue;
            }
            if ((long)(middle+1)*(middle+1) == x)
                return middle+1;
        }
        return 0;
    }
}
