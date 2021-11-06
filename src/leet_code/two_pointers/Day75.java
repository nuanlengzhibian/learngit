package leet_code.two_pointers;

import java.util.Arrays;

public class Day75 {
    public static void main(String[] args) {
        Day75.sortColors(new int[]{2,0,2,1,1,0});
    }
    public static void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}
