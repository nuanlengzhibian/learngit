package leet_code;

public class Day1208 {
    public static void main(String[] args) {
        System.out.println(Day1208.equalSubstring("abcdf", "acdff", 3));
    }
    public static int equalSubstring(String s, String t, int maxCost) {
        //还未完全理解
        int left = 0,right = 0;
        int count = 0;
        int valid = 0;
        while (right < s.length()){
                count = count +Math.abs(t.charAt(right) - s.charAt(right)) ;
                right++;
            while(count > maxCost ){
                count = count -Math.abs(s.charAt(left) - t.charAt(left)) ;
                left++;
            }
            valid = Math.max((right-left),valid);
        }
        return valid;
    }
}
