package leet_code;

public class Day81 {
    public static void main(String[] args) {
        System.out.println(Day81.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }
    public static boolean search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if (nums[i]==target)
                return true;
        }
        return false;
    }
}
