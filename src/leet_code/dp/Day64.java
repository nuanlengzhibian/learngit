package leet_code.dp;

public class Day64 {
    public static void main(String[] args) {
        System.out.println(Day64.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
    public static int minPathSum(int[][] grid) {

        int[][] dp = new int[210][210];
        for (int i = 0;i< grid.length;i++)
            for (int j = 0;j< grid[i].length;j++){
                if (i == 0 && j == 0){
                    dp[i][j] = grid[0][0];
                    continue;
                }
                if (i == 0)
                    dp[i][j] = dp[i][j-1] +grid[i][j];
                if (j == 0)
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                if (i!=0 && j!=0)
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        return dp[grid.length-1][grid[0].length-1];
    }
}
