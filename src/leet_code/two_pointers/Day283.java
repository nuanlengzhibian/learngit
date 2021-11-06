package leet_code.two_pointers;

public class Day283 {
    public static void main(String[] args) {
        Day283.moveZeroes(new int[]{});
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for (int fast = 0;fast < n;fast++){
            if (nums[fast]!=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }

    }
}
