package leet_code;

public class Day1486 {
    public static void main(String[] args) {
        System.out.println(Day1486.xorOperation(10, 5));
    }
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for (int i = 0;i < nums.length;i++){
            nums[i] = start + 2 * i;
        }
        int res = nums[0];
        for (int i = 1;i < nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
}
