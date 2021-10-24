package leet_code.search;

public class Day153 {
    public static void main(String[] args) {
        System.out.println(Day153.findMin(new int[]{3, 1, 2}));
    }
    public static int findMin(int[] nums) {
//        int min = nums[0];
//        for (int i = 1;i < nums.length;i++){
//            if (nums[i]<min)
//                min = nums[i];
//        }
//        return min;
        int left = 0,right = nums.length - 1;
        int middle;
        while(left <= right){
            middle = left+(right-left)/2;
            if (nums[middle] < nums[right]){
                //这里绝对不能写right = middle -1，如果middle正好是最小值就会出现问题。
                //要么写middle的时候返回nums[left],写middle-1后面就返回res。
                right = middle;
            }
            else if (nums[middle] > nums[right]) {
                left = middle + 1;
            }
            else
                return nums[left];
        }
        return nums[left];
    }
}
