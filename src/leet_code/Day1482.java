package leet_code;

public class Day1482 {
    public static void main(String[] args) {
        System.out.println(Day1482.minDays(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 4, 2));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }

        int right = 0;
        for (int num : bloomDay) {
            right = Math.max(right, num);
        }
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = count(bloomDay, mid, k);
            if (count >= m) {
                right = mid ;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int count(int[] nums, int day, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                count = 0;
                res++;
            }
        }
        return res;
    }

}
