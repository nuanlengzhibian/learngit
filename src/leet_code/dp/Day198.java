package leet_code.dp;

public class Day198 {
    public static void main(String[] args) {
        System.out.println(Day198.rob(new int[]{2,7,9,3,1}));
    }
    public static int rob(int[] nums) {
        int res = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        //定义动态规划矩阵并初始化
        for (int i = 0;i < nums.length;i++)
            dp[i] = nums[i];
        //确定状态转移方程
        for (int i = 0;i < nums.length;i++){
            if (i == 0)
                dp[i] = nums[i];
            if (i == 1)
                dp[i] = Math.max(dp[i],dp[i-1]);
            if (i == 2)
                dp[i] = Math.max(dp[i-1],(dp[i]+dp[i-2]));
            if (i > 2)
                dp[i] = Math.max(dp[i-1],Math.max((dp[i-2]+nums[i]),(dp[i-3]+nums[i])));
        }
        return dp[nums.length-1];
    }
}
