package leet_code;

public class Day190 {
    public static void main(String[] args) {
        System.out.println(Day190.reverseBits(-3));
    }
    public static int reverseBits(int n){
        long a = 2147483648L;
        long count = 0L;
        long j = 1L;
        long n1 = 0L;
        if (n >0){
            n1 = n;
        }else{
            n1 = n + a*2;
        }
        for (long i = 2147483648L;i > 0;i = i/2) {
            if (n1/i == 1 ){
                count = count + (n1/i)*j;
            }
            n1 = n1 - (n1/i)*i;
            j = j*2;

        }
        if (n < 0){
            count = count - a*2;
        }
        return (int)count;
    }
}
