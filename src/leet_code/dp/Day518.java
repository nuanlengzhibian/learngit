package leet_code.dp;

public class Day518 {
    public static void main(String[] args) {
        System.out.println(Day518.change(5, new int[]{1, 2, 5}));
    }
    public static int change(int amount, int[] coins) {
        int m = coins.length;
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int j = 0;j<m;j++)
            for (int i= 1;i<=amount;i++){
                if (i-coins[j]>=0)
                dp[i] = dp[i] + dp[i-coins[j]];
            }
        return dp[amount];

    }
}
