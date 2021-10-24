package leet_code.dp;

import java.util.Arrays;

public class Day322 {
    public static void main(String[] args) {
        System.out.println(Day322.coinChange(new int[]{1, 2, 5}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        //对于初始化dp[]数组的值的选取值得注意
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if (i-coins[j]>=0)
                dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
        return (dp[amount]==amount+1)?-1:dp[amount];

    }
}
