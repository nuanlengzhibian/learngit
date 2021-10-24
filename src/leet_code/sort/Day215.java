package leet_code.sort;

public class Day215 {
    public static void main(String[] args) {
        System.out.println(Day215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));

    }
    public static int findKthLargest(int[] nums, int k){
        //冒泡排序后再求第k大的数字。
        for (int i = 0;i < nums.length;i++){
            for (int j = 0;j< nums.length-i-1;j++){
                if (nums[j]>=nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
//        for (int num : nums) {
//            System.out.println(num);
//        }
//        System.out.println("==============");

    return nums[nums.length-k];
    }
}
