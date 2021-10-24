package leet_code.greedy;

public class Day55 {
    public static void main(String[] args) {
        System.out.println(Day55.canJump(new int[]{3, 0, 0, 0}));
    }
    public static boolean canJump(int[] nums) {
        //对值为0的位置进行判断
        for (int i = 0;i < nums.length-1;i++){
            if (nums[i] == 0) {
                if (i == 0)
                    return false;
                else if (i > 0) {
                    int temp = i-1;
                    int count = 1;
                    while (temp >= 0) {
                        if (nums[temp]>count)
                            break;
                        if (nums[temp]<=count)
                            count++;
                        temp--;
                        if (temp < 0)
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
