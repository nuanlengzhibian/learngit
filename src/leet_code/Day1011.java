package leet_code;

import java.util.Arrays;

public class Day1011 {
    public static void main(String[] args) {
        System.out.println(Day1011.shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }
    public static int shipWithinDays(int[] weights, int D) {
        int res = MAX(weights);
        int count = 0;

        for (;;res++){
            int days = 0;
            count = weights[0];
            if (weights[0] == res){
                days++;
                count = 0;
            }
            for (int j = 1;j < weights.length;j++){
                if ((count + weights[j]) <res){
                    count = count + weights[j];
                }else if ((count + weights[j]) == res){
                    days++;
                    count = 0;
                    continue;
                }else {
                    days++;
                    count = weights[j];
                }
                if (j == weights.length-1)
                    days++;
            }
            if (days <= D)
                return res;
        }

    }

    public static int MAX(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
