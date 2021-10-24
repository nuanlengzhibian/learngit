package leet_code.dp;

public class Day1143 {
    public static void main(String[] args) {
        System.out.println(Day1143.longestCommonSubsequence("abcafe","fffade"));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[1100][1100];
        for (int i = 0;i <= text1.length();i++){
            dp[i][0] = 0;
        }
        for (int j = 0;j <= text2.length();j++){
            dp[0][j] = 0;
        }
        //列出状态转移方程
        for (int i = 1;i <= text1.length();i++)
            for (int j = 1;j <= text2.length();j++){
                if (text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        return dp[text1.length()][text2.length()];
    }
}
