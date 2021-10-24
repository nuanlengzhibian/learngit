package leet_code;
import java.lang.StringBuilder;

public class Day03 {
    public static void main(String[] args) {
        System.out.println(Day03.lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
//        if (s == ""){
//            return 0;
//        }
        int left = 0, right = 0;
        StringBuilder count = new StringBuilder("");
        int res = 0;
        boolean a = false;
        while (right < s.length()){
            count.append(s.charAt(right));
            for (int i = left;i < right;i++){
                if (s.charAt(right) == s.charAt(i)){
                    a = true;
                    break;
                }
            }
            right++;
            while (a){
                count.deleteCharAt(0);
                left++;
                a = false;
                for (int i = left;i < right-1;i++){
                    if (s.charAt(right-1) == s.charAt(i)){
                        a = true;
                        break;
                    }
                }

            }
            res = Math.max((right-left),res);
        }
        return res;
    }
}


