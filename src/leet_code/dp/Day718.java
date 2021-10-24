package leet_code.dp;

public class Day718 {

    public static void main(String[] args) {
        System.out.println(Day718.findLength(new int[]{0, 1, 1, 1, 1}, new int[]{1, 0, 1, 0, 1}));
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int res = 0;
        //dp[i][j]表示nums1[0...i]和nums2[0...j]的最长公共子数组
        int[][] dp= new int[1010][1010];
        for (int i=0;i<=m;i++)
            dp[i][0] = 0;
        for (int j=0;j<=n;j++)
            dp[0][j] = 0;
        for (int i=1;i<=m;i++)
            for (int j=1;j<=n;j++){
                if (nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    res = Math.max(res,dp[i][j]);
                }
            }
        return res;
    }
}
