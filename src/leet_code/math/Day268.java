package leet_code.math;

import java.util.Arrays;

public class Day268 {
    public static void main(String[] args) {
        System.out.println(Day268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    public static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int res = n;
//        Arrays.sort(nums);
//        for (int i = 0;i < n;i++){
//            if (i!=nums[i]){
//                res = i;
//                return res;
//            }
//
//        }
//        return res;
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
