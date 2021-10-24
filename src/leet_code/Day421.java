package leet_code;

import java.util.Arrays;

public class Day421 {
    public static void main(String[] args) {
        System.out.println(Day421.findMaximumXOR(new int[]{14,70,53,83,49,91,36,80,92,51,66,70}));
    }
    public static int findMaximumXOR(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0;i < nums.length-1;i++)
            for (int j = i+1;j< nums.length;j++){
                if ((nums[i]^nums[j]) > res)
                    res = nums[i]^nums[j];
            }
        return res;
    }
}
