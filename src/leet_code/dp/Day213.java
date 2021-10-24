package leet_code.dp;

public class Day213 {
    public static void main(String[] args) {
        System.out.println(Day213.rob(new int[]{200,3,140,20,10}));
    }
    public static int rob(int[] nums) {
        //在198的基础上分成两段进行求解。
        int res = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        if (nums.length == 1)
            return nums[0];
        //定义动态规划矩阵并初始化
        for (int i = 0;i < nums.length;i++)
            dp[i] = nums[i];
        //确定状态转移方程
        for (int i = 0;i < nums.length-1;i++){
            if (i == 0)
                dp[i] = nums[i];
            if (i == 1)
                dp[i] = Math.max(dp[i],dp[i-1]);
            if (i == 2)
                dp[i] = Math.max(dp[i-1],(dp[i]+dp[i-2]));
            if (i > 2)
                dp[i] = Math.max(dp[i-1],Math.max((dp[i-2]+nums[i]),(dp[i-3]+nums[i])));
        }
        res = dp[nums.length-2];
        dp[0] = 0;
        for (int i = 1;i < nums.length;i++)
            dp[i] = nums[i];
        for (int i = 1;i < nums.length;i++){
            if (i == 1)
                dp[i] = nums[i];
            if (i == 2)
                dp[i] = Math.max(dp[i],dp[i-1]);
            if (i > 2)
                dp[i] = Math.max(dp[i-1],Math.max((dp[i-2]+nums[i]),(dp[i-3]+nums[i])));
        }

        return Math.max(res,dp[nums.length-1]);
    }
}
