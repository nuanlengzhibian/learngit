package leet_code.sort;

public class offer39 {
    public static void main(String[] args) {
        System.out.println(offer39.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candiate = 0;
        for (int num : nums) {
            if (count == 0){
                candiate = num;
            }
            count+= (candiate==num) ? 1:-1;
        }
       return candiate;
    }
}
