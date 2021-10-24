package leet_code.search;



public class Day33 {
    public static void main(String[] args) {
        System.out.println(Day33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
    public static int search(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int middle;
        while (left <= right){
            middle = left + (right-left)/2;
            if (nums[middle] == target)
                return middle;
            else if (nums[middle] < nums[right]){
                if (nums[middle] < target && target <= nums[right])
                    left = middle+1;
                else
                    right = middle-1;
            }
            else{
                if (nums[middle] > target && target >= nums[left])
                    right = middle -1;
                else
                    left = middle+1;
            }
        }
        return -1;
    }
}
