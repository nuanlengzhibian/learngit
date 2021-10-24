package leet_code.math;

import java.util.Arrays;

public class Day204 {
    public static void main(String[] args) {
        System.out.println(Day204.countPrimes(5000000));
    }
    public static int countPrimes(int n) {
        //暴力解法,当数值太大时会超时。
//        int count = 0;
//        if (n == 0 || n == 1)
//            return count;
//        for (int i = 2;i < n;i++){
//            for (int j = 2;j*j<= i;j++){
//                if (i%j == 0){
//                   count--;
//                    break;
//                }
//
//            }
//            count++;
//        }
//        return count;
        //埃氏筛
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
