package leet_code;

public class Day263 {
    public static void main(String[] args) {
        System.out.println(Day263.isUgly(10));
    }
    public static boolean isUgly(int n) {
        //递归写法
//        if (n == 0)
//            return false;
//        if (n == 1)
//            return true;
//        else if (n%2 == 0)
//            return isUgly(n/2);
//        else if (n%3 == 0)
//            return isUgly(n/3);
//        else if (n%5 == 0)
//            return isUgly(n/5);
//        else
//            return false;
        while(true){
            if (n == 0)
                return false;
            if (n == 1)
                return true;
            else if (n%2 == 0)
                n = n/2;
            else if (n%3 == 0)
                n = n/3;
            else if (n%5 == 0)
                n = n/5;
            else
                return false;
        }

    }
}
