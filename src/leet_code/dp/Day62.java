package leet_code.dp;

public class Day62 {
    public static void main(String[] args) {
        System.out.println(Day62.uniquePaths(23, 12));
    }
    public static int uniquePaths(int m, int n) {
        //方案一是利用动态规划的思想
//        int[][] dp = new int[m+1][n+1];
//        for (int i = 1;i<=m;i++)
//            for (int j = 1;j<=n;j++){
//                if (i==1&&j==1){
//                    dp[1][1] = 1;
//                    continue;
//                }
//                if (i==1)
//                    dp[i][j] = dp[i][j-1];
//                if (j==1)
//                    dp[i][j] = dp[i-1][j];
//                if (i!=1&&j!=1)
//                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
//            }
//        return dp[m][n];

       //方案二是利用排列与组合的思想，为组合数Cm-1/m+n-2,但是存在测试用例比较大的时候数据表示溢出的问题。
        return (int)(factorial(m+n-2)/factorial(n-1)/factorial(m-1));
    }
    public static long factorial(int n){
        if (n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);

    }
}
