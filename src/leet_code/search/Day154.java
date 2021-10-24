package leet_code.search;

public class Day154 {
    public static void main(String[] args) {
        System.out.println(Day154.findMin(new int[]{2, 2, 2, 0, 1}));
    }
    public static int findMin(int[] nums) {
        //写法无意义
//        int min = nums[0];
//        for (int i = 1;i < nums.length;i++){
//            if (min > nums[i])
//                min = nums[i];
//        }
//        return min;
        int left = 0,right = nums.length - 1;
        int middle;
        while(left <= right){
            middle = left+(right-left)/2;
            if (nums[middle] < nums[right]){
                right = middle;
            }
            else if (nums[middle] > nums[right]){
                left = middle + 1;
            }else{
                //去重，相比153的差别所在
                right--;
            }

        }
        return nums[left];
    }
}
