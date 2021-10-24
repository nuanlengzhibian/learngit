package leet_code.math;

public class Day50 {
    public static void main(String[] args) {
        System.out.println(Day50.myPow(0.00001, 2147483647));
    }
    public static double myPow(double x, int n) {
        //数组存储大小超过限制
//        if (n>=0){
//            double[] dp = new double[n];
//            for (int i = 0;i < n;i++){
//                if (i == 0)
//                    dp[i] = x;
//                if (i == 1)
//                    dp[i] = x*x;
//                if (i > 1)
//                    dp[i] = dp[i-1]*x;
//            }
//            return dp[n-1];
//        }else {
//            double[] dp = new double[-n];
//            for (int i = 0;i > n;i--){
//                if (i == 0)
//                    dp[-i] = 1/x;
//                if (i == -1)
//                    dp[-i] = 1/x/x;
//                if (i < -1)
//                    dp[-i] = dp[-i-1]/x;
//            }
//            return dp[-n-1];
//        }
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
    public static double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
