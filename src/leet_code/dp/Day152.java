package leet_code.dp;

public class Day152 {
    public static void main(String[] args) {
        System.out.println(Day152.maxProduct(new int[]{-2, 2, -1,3}));
    }
    public static int maxProduct(int[] nums) {
        //感觉没有用到动态规划的思想也解决了
        int a=1;
        int max=nums[0];

        for(int num:nums){
            a=a*num;
            if(max<a)max=a;
            if(num==0)a=1;

        }
        a=1;
        for(int i=nums.length-1;i>=0;i--){
            a=a*nums[i];
            if(max<a)max=a;
            if(nums[i]==0)a=1;
        }
        return max;
    }
}
