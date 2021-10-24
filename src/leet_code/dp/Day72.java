package leet_code.dp;

public class Day72 {
    public static void main(String[] args) {
        System.out.println(Day72.minDistance("intention", "execution"));
    }
    public static int minDistance(String word1, String word2) {
        //采用dp table的形式来进行优化
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1;i<=m;i++)
            dp[i][0] = i;
        for (int j = 1;j<=n;j++)
            dp[0][j] = j;
        for (int i=1;i<=m;i++)
            for (int j=1;j<=n;j++){
                if (word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=Math.min(dp[i][j-1]+1,Math.min(dp[i-1][j-1]+1,dp[i-1][j]+1));
            }
        return dp[m][n];
    }
    //采用递归的方法，但是会超时，因为采用的暴力解法，存在重叠子问题。
    //需要采用备忘录的形式来记录，避免重复计算。
//    public static int dp(int i,int j,String word1,String word2){
//        if (i == -1)
//            return j+1;
//        if (j == -1)
//            return i+1;
//        if (word1.charAt(i)==word2.charAt(j))
//            return dp(i-1,j-1,word1,word2);
//        else
//            return Math.min(dp(i-1,j-1,word1,word2)+1,Math.min(dp(i,j-1,word1,word2)+1,dp(i-1,j,word1,word2)+1));
//    }

}
