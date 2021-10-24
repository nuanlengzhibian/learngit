package leet_code;

public class Day264 {
    public static void main(String[] args) {
        System.out.println(Day264.nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        //遍历效率比较低
//        int count = 0;
//        int flag = 0;
//        for (int i = 1;count<n;i++){
//            int j = i;
//            while(true){
//                if (j == 1){
//                    count++;
//                    flag = i;
//                    break;
//                }
//                else if (j%2 == 0)
//                    j = j/2;
//                else if (j%3 == 0)
//                    j = j/3;
//                else if (j%5 == 0)
//                    j = j/5;
//                else
//                    break;
//            }
//        }
//        return flag;
        int[] dp= new int[1700];
        dp[0] = 1;
        int i = 0,j = 0,k = 0;

        for (int m = 1;m < n;m++){
            dp[m] = Math.min(dp[i]*2, Math.min(dp[j]*3,dp[k]*5));
            if (dp[m] == dp[i]*2)
                i++;
            if (dp[m] == dp[j]*3)
                j++;
            if (dp[m] == dp[k]*5)
                k++;
        }
        return dp[n-1];
    }
}
