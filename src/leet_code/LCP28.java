package leet_code;

public class LCP28 {
    public static void main(String[] args) {
        System.out.println(LCP28.purchasePlans(new int[]{2, 5, 3, 5}, 6));
    }
    public static int purchasePlans(int[] nums, int target) {
        int count = 0;
        for (int i = 0;i < nums.length-1;i++)
            for (int j = i+1;j<nums.length;j++){
                if ((nums[i]+nums[j])<=target){
                    count = count + 1 ;
                }
            }
        return count;
    }
}
