package leet_code.sort;

import java.util.Arrays;
import java.util.Random;

public class Day912 {
    public static void main(String[] args) {
        int[] a = Day912.sortArray(new int[]{7,5,1,3,2,8,9});
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static int[] sortArray(int[] nums) {
//        Arrays.sort(nums);
//        return nums;
        quicksort(nums,0, nums.length-1);
        return nums;
    }
    //采用快排的思想
    //递归函数
    public static void quicksort(int[] nums,int l,int r){
        if (l<r){
            int pos = randomSelection(nums, l, r);
            quicksort(nums, l, pos-1);
            quicksort(nums, pos+1, r);
        }
    }

    //随机选择一个主元作为标志
    public static int randomSelection(int[] nums,int l,int r){
        //选取标志位
        int i = new Random().nextInt(r-l+1)+l;
        swap(nums,i,r);
        return partition(nums, l, r);
    }
    //确定好标志位后，将依次进行排序，大于此的都放到右边，小于此的都放到左边
    public static int partition(int[] nums,int l,int r){
        int i = l-1;
        for (int j=l;j<=r-1;j++){
            if (nums[j]<=nums[r]){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,r);
        return i+1;
    }

    //交换函数
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
