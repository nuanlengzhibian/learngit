package leet_code.dp;



public class Day91 {
    public static void main(String[] args) {
        System.out.println(Day91.numDecodings("1201234"));
    }
    public static int numDecodings(String s) {

        int n = s.length();
        int[] dp = new int[n + 1];
        if(s.charAt(0) == '0')
            return 0;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 1;i < n;i++){
            if(s.charAt(i) == '0' && s.charAt(i - 1) != '1' &&s.charAt(i - 1) != '2'){
                return 0;
            }
            int x = Integer.parseInt(s.substring(i - 1,i + 1));
            if(x == 10 || x == 20){
                dp[i + 1] = dp[i - 1];
            }
            else if(x > 10 && x <= 26){
                dp[i + 1] = dp[i] + dp[i - 1];
            }else{
                dp[i + 1] = dp[i];
            }
        }
        return dp[n];
    }
}
