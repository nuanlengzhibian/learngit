package leet_code.offer;

public class Day10_1 {
    public static void main(String[] args) {
        System.out.println(Day10_1.fib(46));
    }
    public static int fib(int n) {
        int[] dp = new int[105];
        for (int i = 0;i <= n;i++){
            if(i == 0)
                dp[i] = 0;
            else if (i == 1)
                dp[i] = 1;
            else{
                dp[i] = dp[i-1]+dp[i-2];
                if (dp[i]>1000000007)
                    dp[i] = dp[i]%1000000007;
            }

        }
        return dp[n];

    }
}
