package leet_code.math;

public class Day07 {
    public static void main(String[] args) {
        System.out.println(Day07.reverse(0));
//        long a = 9646324351L;
//        System.out.println(a>(Math.pow(2,31)-1));
    }
    public static int reverse(int x) {
        long count = 0;
        for (;x!=0;){
            count = count * 10 + x % 10;
            x = x / 10;
        }
        //利用三元表达式。
        return (int)count==count? (int)count:0;

//        long count = 0;
//        for (;x!=0;){
//            count = count * 10 + x % 10;
//            if (count>(Math.pow(2,31)-1) || count<-Math.pow(2,31))
//                return 0;
//            x = x / 10;
//        }
//        return (int)count;

    }
}
