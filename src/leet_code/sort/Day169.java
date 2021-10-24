package leet_code.sort;

import java.util.Arrays;

public class Day169 {
    public static void main(String[] args) {
        System.out.println(Day169.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    public static int majorityElement(int[] nums) {
//        int half = nums.length/2;
//        int res = nums[0];
//        int count = 1;
//        Arrays.sort(nums);
//        for (int i = 1;i < nums.length;i++){
//            int temp = nums[i-1];
//            if (nums[i] == nums[i-1]){
//                count++;
//                if (count > half)
//                    return temp;
//            }else
//                count = 1;
//        }
//        return res;
        //投票算法
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
    }
}
