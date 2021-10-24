package leet_code.dp;

public class Day887 {
    public static void main(String[] args) {
        System.out.println(Day887.superEggDrop(3, 14));
    }
    public static int superEggDrop(int k, int n) {

        int[][] dp = new int[110][10010];
        for (int j=0;j<=n;j++)
            dp[1][j] = j;
        for (int i=0;i<=k;i++)
            dp[i][0] = 0;

        for (int j = 1;j<=k;j++){
            int res = Integer.MAX_VALUE;
            for (int i = 1;i <= n;i++){
                dp[j][i] = Math.min(res,Math.max(dp[j-1][i-1],dp[j][n-i])+1);
                res = dp[j][i];
            }
        }

        return dp[k][n];
    }
}
