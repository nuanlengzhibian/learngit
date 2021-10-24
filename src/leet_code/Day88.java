package leet_code;

import java.util.Arrays;

public class Day88 {
    public static void main(String[] args) {
        Day88.merge(new int[]{1,4,6,7,0,0,0},4,new int[]{2,5,6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m,k = 0;k < n;k++,i++){
            nums1[i] = nums2[k];
        }
        //冒泡排序
//        for (int i = 0;i < nums1.length;i++)
//            for (int j = 0;j < nums1.length-i-1;j++){
//                if (nums1[j]>nums1[j+1]){
//                    int temp = nums1[j];
//                    nums1[j] = nums1[j+1];
//                    nums1[j+1] = temp;
//                }
//            }
        Arrays.sort(nums1);
        for (int i : nums1) {
            System.out.println(i);
        }

    }
}
