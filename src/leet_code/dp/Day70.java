package leet_code.dp;

public class Day70 {
    public static void main(String[] args) {
        System.out.println(Day70.climbStairs(10));
    }
    public static int climbStairs(int n) {

        //dp[i]数组表示当到达第i个阶梯时走的方式的总数。
        int[] dp=new int[n+1];
        for (int i=0;i<=n;i++){
            if (i==1||i==0)
                dp[i]=1;
            else
                dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
