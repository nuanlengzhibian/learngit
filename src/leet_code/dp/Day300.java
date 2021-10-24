package leet_code.dp;

import java.util.Arrays;

public class Day300 {
    public static void main(String[] args) {
        System.out.println(Day300.lengthOfLIS(new int[]{0,1,0,3,2}));
    }
    public static int lengthOfLIS(int[] nums) {
       //动态规划的思想
        int res = 1;
        //首先确定dp数组里面要存放的每个元素代表的含义，这个需要人为选定，并选择合适的值进行初始化。
        //这里dp数组里面存放的每个元素dp[i]代表包含元素nums[i]的最大递增子序列。
        int[] dp = new int[2600];
        Arrays.fill(dp,1);
        //确定状态转移方程
        for (int i = 0;i < nums.length;i++)
            for (int j = 0;j < i;j++)
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i],(dp[j]+1));
        //最后取数组中的最大值。
        for (int i = 0;i < nums.length;i++){
            if (res < dp[i])
                res = dp[i];
        }
        return res;
    }
}
