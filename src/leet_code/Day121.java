package leet_code;


public class Day121 {
    public static void main(String[] args) {
        System.out.println(Day121.maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
//超出时间限制，暴力破解效率太低
//        int res = 0;
//        for (int i=0;i<prices.length;i++)
//            for (int j=i+1;j<prices.length;j++){
//                if ((prices[j]-prices[i])>res)
//                    res =prices[j]-prices[i];
//            }
//        return res;
                //对dp数组的定义为包含dp
        
//动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
       int max = 0;
       int min = prices[0];
       for (int i=1;i<prices.length;i++){
           max = Math.max(max,prices[i]-min);
           min = Math.min(min,prices[i]);

       }
        return max;
    }
}
