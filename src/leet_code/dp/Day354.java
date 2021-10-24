package leet_code.dp;

import java.util.Arrays;
import java.util.Comparator;

public class Day354 {
    public static void main(String[] args) {
        System.out.println(Day354.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
    }
    public static int maxEnvelopes(int[][] envelopes) {
        //同样利用到了动态规划的思想，在最长公共子序列的基础上进行改进，相当于二维的最长公共子序列。
        //对二维数组进行排序,只比较到第二维为2的情况。这个写法一定要掌握，很重要。
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        int res = 1;
        int[] dp = new int[5050];
        //先对dp数组进行初始化赋值
        Arrays.fill(dp,1);
        //确定状态转移方程
        for (int i = 0;i < envelopes.length;i++)
            for (int j = 0;j < i;j++)
                    if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1] )
                        dp[i] = Math.max(dp[i],(dp[j]+1));
        for (int i = 0;i < envelopes.length;i++){
            if (res < dp[i])
                res = dp[i];
        }
        return res;
    }
}
