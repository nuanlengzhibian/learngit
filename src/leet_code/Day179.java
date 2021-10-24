package leet_code;

import java.util.Arrays;

public class Day179 {
    public static void main(String[] args) {
        System.out.println(Day179.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] num = new String[n];
        for(int i = 0;i<n;i++){
            num[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(num,(a,b)->{return (b+a).compareTo(a+b);});
        if(num[0].equals("0")){return "0";}
        else{
            StringBuilder a = new StringBuilder();
            for(int i = 0;i<n;i++){
                a.append(num[i]);
            }
            return a.toString();
        }
    }
}
