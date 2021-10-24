package leet_code.search;

public class Day162 {
    public static void main(String[] args) {
        System.out.println(Day162.findPeakElement(new int[]{3,4,3,2,1}));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        int middle = 0;
        if (nums.length == 1)
            return 0;
        if (nums[0]>nums[1])
            return 0;
        if (nums[nums.length-2]<nums[nums.length-1])
            return nums.length-1;
        while (left <= right){
            middle = left + (right - left)/2;
                if (nums[middle] < nums[middle + 1])
                    left = middle + 1;
                else if (nums[middle] > nums[middle + 1] && nums[middle] < nums[middle - 1])
                    right = middle - 1;
                else {
                    return middle;
                }


        }
        return middle;
    }
}
