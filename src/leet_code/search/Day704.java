package leet_code.search;

public class Day704 {
    public static void main(String[] args) {
        System.out.println(Day704.search(new int[]{-1,0,3,5,9,12},2));
    }
    public static int search(int[] nums, int target) {
        //二分查找
        int left = 0,right = nums.length-1;
        int middle = (left+right)/2;
        while(left <= right){
            if (nums[middle] == target)
                return middle;
            if (nums[middle] < target)
                left = middle + 1;
            if (nums[middle] > target)
                right = middle - 1;
            middle = (left+right)/2;
        }
        return -1;
    }
}
