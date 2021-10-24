package leet_code.dp;

public class Day53 {
    public static void main(String[] args) {
        System.out.println(Day53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[100005];
        int res = Integer.MIN_VALUE;
        if (nums.length == 1)
            return nums[0];
        for (int i = 0;i< nums.length;i++){
            if (i == 0)
                dp[i] = nums[i];
            else
                dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
        }

        for (int i = 0;i < nums.length;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
