package leet_code.greedy;

public class Day45 {
    public static void main(String[] args) {
        System.out.println(Day45.jump(new int[]{2, 3, 0, 1, 4}));
    }
    public static int jump(int[] nums) {
        //dp[i]定义了到i这个位置所需要的最小跳跃数
//        int[] dp = new int[nums.length];
//        for (int i = 0;i < nums.length;i++){
//            for (int j = nums[i];j>0;j--){
//                if ((i+j)< nums.length)
//                    dp[i+j] = (dp[i+j]==0)? (dp[i]+1):Math.min(dp[i+j],dp[i]+1);
//            }
//        }
//
//        return dp[nums.length-1];


        int n = nums.length;
        int end = 0;
        int farthest = 0;
        int jumps = 0;
        for (int i = 0;i < n-1;i++){
            farthest = Math.max(i+nums[i],farthest);
            if (end == i){
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
