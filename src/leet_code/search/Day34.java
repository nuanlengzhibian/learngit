package leet_code.search;

public class Day34 {
    public static void main(String[] args) {
        int[] a = Day34.searchRange(new int[]{0,0},1);
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        int middle;
        int[] res = new int[]{-1,-1};
        if (nums.length == 0)
            return res;
        while(left <= right){
            middle = left+(right-left)/2;
            if (nums[middle]<target)
                left = middle+1;
            else if (nums[middle]>target)
                right = middle-1;
            else{
                left = middle;
                while(left > 0 && nums[left]==nums[left-1]){
                    left--;
                }
                res[0] = left;
                right = middle;
                while (right < nums.length-1 && nums[right]== nums[right+1]){
                    right++;
                }
                res[1] = right;
                return res;
            }
        }
        return res;
    }
}
