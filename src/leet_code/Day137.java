package leet_code;

import java.util.Arrays;

public class Day137 {
    public static void main(String[] args) {
        System.out.println(Day137.singleNumber(new int[]{2,3,2,2}));
    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;){
            if (i == nums.length-1){
              return nums[i];
            } else if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                i = i+3;
            }else
                return nums[i];
        }
        return res;
    }
}
